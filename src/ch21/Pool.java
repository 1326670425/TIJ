/**
 * @Title Pool.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月13日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;

/**
 * @ClassName Pool
 * @Description 对象池
 * <p>Semaphore:计数信号量，允许n个任务同时访问一个资源
 * @author 吴扬颉
 * @date 2019年4月13日
 * 
 */
public class Pool<T> {
	private int size;
	private List<T> items = new ArrayList<T>();
	private volatile boolean[] checkedOut;
	private Semaphore available;
	public Pool(Class<T> classObject, int size){
		this.size = size;
		checkedOut = new boolean[size];
		available = new Semaphore(size, true);
		// Load pool with objects that can be checked out
		for(int i = 0; i < size; i++)
			try{
				// Assumes a default constructor
				items.add(classObject.newInstance());
			}catch(Exception e){
				throw new RuntimeException(e);
			}
	}
	private synchronized T getItem(){
		for(int i = 0; i < size; i++)
			if(!checkedOut[i]){
				checkedOut[i] = true;
				return items.get(i);
			}
		return null; // Semaphore prevents reaching here
	}
	public T checkOut() throws InterruptedException{
		available.acquire();
		return getItem();
	}
	private synchronized boolean releaseItem(T item){
		int index = items.indexOf(item);
		if(index == -1)
			return false;
		if(checkedOut[index]){
			checkedOut[index] = false;
			return true;
		}
		return false;
	}
	public void checkIn(T x){
		if(releaseItem(x))
			available.release();
	}
}

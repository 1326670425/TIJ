/**
 * @Title CallableDemo.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;

class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id){
		this.id = id;
	}
	public String call(){
		return "result of TaskWithResult " + id;
	}
}


/**
 * @ClassName CallableDemo
 * @Description 如果想从任务中得到返回值，可以实现Callable接口，它的类型参数表示的是从call()中返回的值，并且必须使用
 * ExecutorService.submit()来调用
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0; i < 10; i++)
			results.add(exec.submit(new TaskWithResult(i)));
		for(Future<String> fs : results){
			try{
				// get()方法将会被阻塞，直到完成
				System.out.println(fs.get());
			}catch(InterruptedException e){
				System.out.println(e);
				return;
			}catch(ExecutionException e){
				System.out.println(e);
			}finally{
				exec.shutdown();
			}
		}
	}
}

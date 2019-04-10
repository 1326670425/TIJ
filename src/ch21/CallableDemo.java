/**
 * @Title CallableDemo.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
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
 * @Description �����������еõ�����ֵ������ʵ��Callable�ӿڣ��������Ͳ�����ʾ���Ǵ�call()�з��ص�ֵ�����ұ���ʹ��
 * ExecutorService.submit()������
 * @author �����
 * @date 2019��4��10��
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
				// get()�������ᱻ������ֱ�����
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

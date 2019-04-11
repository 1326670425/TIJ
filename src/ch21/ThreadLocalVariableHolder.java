/**
 * @Title ThreadLocalVariableHolder.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;

class Accessor implements Runnable{
	private final int id;
	public Accessor(int id){ this.id = id; }
	public void run(){
		while(!Thread.currentThread().isInterrupted()){
			ThreadLocalVariableHolder.increment();
			System.out.println(this);
			Thread.yield();
		}
	}
	public String toString(){
		return "#" + id + ": " + ThreadLocalVariableHolder.get();
	}
}

/**
 * @ClassName ThreadLocalVariableHolder
 * @Description �̱߳��ش洢
 * <p>��ֹ�����ڹ�����Դ�ϲ�����ͻ�ĵڶ��ַ�ʽ���Ǹ����Ա����Ĺ����̱߳��ش洢��һ���Զ������ƣ�����Ϊʹ����ͬ������ÿ����ͬ���̶߳�������ͬ�Ĵ洢��
 * ����ʹ������Խ�״̬���̹߳�������
 * @author �����
 * @date 2019��4��11��
 * 
 */
public class ThreadLocalVariableHolder {
	private static ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
		private Random rand = new Random(47);
		protected synchronized Integer initialValue(){
			return rand.nextInt(10000);
		}
	};
	public static void increment(){
		value.set(value.get() + 1);
	}
	public static int get(){ return value.get(); }
	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new Accessor(i));
		TimeUnit.SECONDS.sleep(3);
		exec.shutdownNow();
	}
}

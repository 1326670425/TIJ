/**
 * @Title SelfManaged.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SelfManaged
 * @Description 在构造器中启动线程可能会出现问题，因为另一个任务可能会在构造器结束前开始执行，这意味着该任务能够访问处于不稳定状态的对象
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SelfManaged implements Runnable {
	private int countDown = 5;
	private Thread t = new Thread(this);
	public SelfManaged(){ t.start(); }
	public String toString(){
		return Thread.currentThread().getName() + "(" + countDown + "), ";
	}
	public void run(){
		while(true){
			System.out.print(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			new SelfManaged();
	}
}

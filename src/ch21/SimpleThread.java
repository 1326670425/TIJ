/**
 * @Title SimpleThread.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SimpleThread
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SimpleThread extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	public SimpleThread(){
		// 存储线程名称为threadCount的数值
		super(Integer.toString(++threadCount));
		start();
	}
	public String toString(){
		// getName()获取线程名称
		return "#" + getName() + "(" + countDown + "), ";
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
			new SimpleThread();
	}
}

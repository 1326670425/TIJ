/**
 * @Title BasicThreads.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName BasicThreads
 * @Description 要实现线程行为，必须显式的将一个任务附着到线程上：提交给Thread构造器
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}

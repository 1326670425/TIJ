/**
 * @Title MainThread.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName MainThread
 * @Description 单纯实现Runnable接口并不会产生任何内在的线程能力
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class MainThread {
	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		launch.run();
	}
}

/**
 * @Title ResponsiveUI.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception{
		while(d > 0)
			d = d + (Math.PI + Math.E) / d;
		System.in.read();
	}
}

/**
 * @ClassName ResponsiveUI
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class ResponsiveUI extends Thread{
	private static volatile double d = 1;
	public ResponsiveUI(){
		setDaemon(true);
		start();
	}
	public void run(){
		while(true)
			d = d + (Math.PI + Math.E) / d;
	}
	
	public static void main(String[] args) throws Exception{
		// 编译器被欺骗了，认为程序能够到达读取控制台输入的那一行。结果会陷入死循环
		// new UnresponsiveUI();
		new ResponsiveUI();
		// ResponsiveUI的run方法运行在另一个线程中，所以不会影响主线程获取控制台输入
		System.in.read();
		System.out.println(d);
	}
}

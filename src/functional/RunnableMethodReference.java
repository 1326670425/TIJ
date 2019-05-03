/**
 * @Title RunnableMethodReference.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

class Go {
	static void go() {
		System.out.println("Go::go()");
	}
}

/**
 * @ClassName RunnableMethodReference
 * @Description Lambda表达式和方法引用作为Runnable
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class RunnableMethodReference {
	public static void main(String[] args) {
		// 匿名内部类方式
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Annoymous");
			}
		}).start();
		
		// Lambda表达式方式
		new Thread(
			() -> System.out.println("lambda")	
		).start();
		
		// 方法引用
		new Thread(Go::go).start();
	}
}

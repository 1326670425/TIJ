/**
 * @Title WhoCalled.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

/**
 * @ClassName WhoCalled
 * @Description 输出发生异常时的栈轨迹
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class WhoCalled {
	static void f(){
		try{
			throw new Exception();
		}catch(Exception e){
			for(StackTraceElement ste : e.getStackTrace())
				System.out.println(ste.getMethodName());
		}
	}
	static void g() { f(); }
	static void h() { g(); }
	public static void main(String[] args) {
		f();
		System.out.println("-----------------------------------");
		g();
		System.out.println("-----------------------------------");
		h();
		System.out.println("-----------------------------------");
	}
}

/**
 * @Title MultipleReturns.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

/**
 * @ClassName MultipleReturns
 * @Description finally总是会执行，所以在一个方法中可以从多个点返回，并且可以保证重要的清理工作仍然会进行
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class MultipleReturns {
	public static void f(int i){
		System.out.println("Initialization that requires cleanup");
		try{
			System.out.println("Point 1");
			if(i == 1) return;
			System.out.println("Point 2");
			if(i == 2) return;
			System.out.println("Point 3");
			if(i == 3) return;
			System.out.println("End");
			return;
		}finally{
			System.out.println("Performing cleanup");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			f(i);
		}
	}
}

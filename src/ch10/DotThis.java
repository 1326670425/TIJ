/**
 * @Title DotThis.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName DotThis
 * @Description 内部类产生外部类对象的引用
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class DotThis {
	void f(){ System.out.println("DotThis.f()"); }
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){ return new Inner(); }
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}

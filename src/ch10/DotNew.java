/**
 * @Title DotNew.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName DotNew
 * @Description 外部类产生内部类对象
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class DotNew {
	public class Inner{}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();

	}
}

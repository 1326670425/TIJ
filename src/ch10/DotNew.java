/**
 * @Title DotNew.java
 * @Package ch10
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch10;

/**
 * @ClassName DotNew
 * @Description �ⲿ������ڲ������
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class DotNew {
	public class Inner{}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();

	}
}

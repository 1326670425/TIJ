/**
 * @Title ClassInterface.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月6日
 * @version 1.0
 */
package ch10;

/**
 * @ClassName ClassInterface
 * @Description 接口内部的类：嵌套类可以作为接口的一部分，甚至可以在内部类实现其外围接口
 * @author 吴扬颉
 * @date 2019年1月6日
 * 
 */
public interface ClassInterface {
	void howdy();
	class Test implements ClassInterface{
		public void howdy(){
			System.out.println("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}

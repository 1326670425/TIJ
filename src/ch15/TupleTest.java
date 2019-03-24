/**
 * @Title TupleTest.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;

class Amphibian{}
class Vehicle{}


/**
 * @ClassName TupleTest
 * @Description 元组的使用测试
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class TupleTest {
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 47);
	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		// ttsi.first = "there" // 错误:final
		TwoTuple<Amphibian, Vehicle> ttav = new TwoTuple<Amphibian, Vehicle>(new Amphibian(), new Vehicle());
		System.out.println(ttav);
	}
}

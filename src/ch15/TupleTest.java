/**
 * @Title TupleTest.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��24��
 * @version 1.0
 */
package ch15;

class Amphibian{}
class Vehicle{}


/**
 * @ClassName TupleTest
 * @Description Ԫ���ʹ�ò���
 * @author �����
 * @date 2019��3��24��
 * 
 */
public class TupleTest {
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 47);
	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		// ttsi.first = "there" // ����:final
		TwoTuple<Amphibian, Vehicle> ttav = new TwoTuple<Amphibian, Vehicle>(new Amphibian(), new Vehicle());
		System.out.println(ttav);
	}
}

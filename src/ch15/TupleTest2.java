/**
 * @Title TupleTest2.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName TupleTest2
 * @Description ����Tuple
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class TupleTest2 {
	//���ز���������
	static TwoTuple<String, Integer> f(){ return Tuple.tuple("hi", 47); }
	//���طǲ���������
	static TwoTuple f2(){ return Tuple.tuple("hi", 47); }
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
	}
}

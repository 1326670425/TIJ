/**
 * @Title TupleTest2.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName TupleTest2
 * @Description 测试Tuple
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class TupleTest2 {
	//返回参数化对象
	static TwoTuple<String, Integer> f(){ return Tuple.tuple("hi", 47); }
	//返回非参数化对象
	static TwoTuple f2(){ return Tuple.tuple("hi", 47); }
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
	}
}

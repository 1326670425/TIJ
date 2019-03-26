/**
 * @Title ArrayOfGeneric.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName ArrayOfGeneric
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class ArrayOfGeneric {
	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		// 产生ClassCastException异常
		// gia = (Generic<Integer>[])new Object[SIZE];
		gia = (Generic<Integer>[])new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		// gia[1] = new Object();
		// gia[2] = new Generic<Double>();
	}
}

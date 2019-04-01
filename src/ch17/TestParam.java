/**
 * @Title TestParam.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;

/**
 * @ClassName TestParam
 * @Description 测试框架之数据转换
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class TestParam {
	public final int size;
	public final int loops;
	public TestParam(int size, int loops){
		this.size = size;
		this.loops = loops;
	}
	public static TestParam[] array(int... values){
		int size = values.length / 2;
		TestParam[] result = new TestParam[size];
		int n = 0;
		for(int i = 0; i < size; i++)
			result[i] = new TestParam(values[n++], values[n++]);
		return result;
	}
	public static TestParam[] array(String[] values){
		int[] vals = new int[values.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = Integer.decode(values[i]);
		}
		return array(vals);
	}
}

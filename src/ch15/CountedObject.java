/**
 * @Title CountedObject.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName CountedObject
 * @Description 带有默认构造器的简单类，测试使用BasicGenerator
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class CountedObject {
	private static long counter = 0;
	private final long id = counter++;
	public long id(){ return id; }
	public String toString(){ return "CountedObject " + id; }
}

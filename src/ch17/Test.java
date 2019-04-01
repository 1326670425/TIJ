/**
 * @Title Test.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;

/**
 * @ClassName Test
 * @Description 测试框架，每个Test对象都存储着该测试的名字
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public abstract class Test<C> {
	String name;
	public Test(String name){ this.name = name; }
	abstract int test(C container, TestParam tp);
}

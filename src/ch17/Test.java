/**
 * @Title Test.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch17;

/**
 * @ClassName Test
 * @Description ���Կ�ܣ�ÿ��Test���󶼴洢�Ÿò��Ե�����
 * @author �����
 * @date 2019��4��1��
 * 
 */
public abstract class Test<C> {
	String name;
	public Test(String name){ this.name = name; }
	abstract int test(C container, TestParam tp);
}

/**
 * @Title CountedObject.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName CountedObject
 * @Description ����Ĭ�Ϲ������ļ��࣬����ʹ��BasicGenerator
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class CountedObject {
	private static long counter = 0;
	private final long id = counter++;
	public long id(){ return id; }
	public String toString(){ return "CountedObject " + id; }
}

/**
 * @Title SimpleHolder.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName SimpleHolder
 * @Description �Ƿ���ʾ����set()��get()ֱ�Ӵ洢������ֵ��ת�����ڵ���get()ʱ����ܼ���
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class SimpleHolder {
	private Object obj;
	public void set(Object obj){ this.obj = obj; }
	public Object get(){ return obj; }
	public static void main(String[] args) {
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String)holder.get();
		System.out.println(s);
	}
}

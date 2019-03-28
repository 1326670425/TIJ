/**
 * @Title GenericCast.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

class FixedSizeStack<T>{
	private int index = 0;
	private Object[] storage;
	public FixedSizeStack(int size){
		storage = new Object[size];
	}
	public void push(T item){ storage[index++] = item; }
	// ���ڲ������������޷�֪�����ת���Ƿ�ȫ������pop()ʵ���ϲ�û��ִ��ת��
	// ��ΪT������ΪObject��pop()ʵ����ֻ�ǰ�Objectת��ΪObject
	@SuppressWarnings("unchecked")
	public T pop(){ return (T)storage[--index]; }
}

/**
 * @ClassName GenericCast
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class GenericCast {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		FixedSizeStack<String>	strings = new FixedSizeStack<String>(SIZE);
		for(String s : "A B C D E F G H I J".split(" "))
			strings.push(s);
		for(int i = 0; i < SIZE; i++){
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}
}

/**
 * @Title InstantiateGenericType.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind){
		try{
			x = kind.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class Employee{}

/**
 * @ClassName InstantiateGenericType
 * @Description ��Ҫ��������ʵ��ʱ��java�������Ǵ���һ���������󣬲�ʹ�����������µ�ʵ����
 * <p>���ݵĹ����������Class����������ʹ�����ͱ�ǩ����ô�Ϳ�����newInstance()����������
 * @author �����
 * @date 2019��3��26��
 * 
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try{
			// Integerû��Ĭ�Ϲ�����������ʧ��
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		}catch(Exception e){
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}
}

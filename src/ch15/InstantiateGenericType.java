/**
 * @Title InstantiateGenericType.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
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
 * @Description 想要创建类型实例时，java的做法是传递一个工厂对象，并使用它来创建新的实例。
 * <p>最便捷的工厂对象就是Class对象，因此如果使用类型标签，那么就可以用newInstance()来创建对象。
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try{
			// Integer没有默认构造器，创建失败
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		}catch(Exception e){
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}
}

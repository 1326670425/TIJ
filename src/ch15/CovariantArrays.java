/**
 * @Title CovariantArrays.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

/**
 * @ClassName CovariantArrays
 * @Description 通配符
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		// 运行时类型是Apple[]
		try{
			// 编译器允许你添加Fruit，编译可以通过，但是运行时出错
			fruit[0] = new Fruit(); // ArrayStoreException
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			fruit[0] = new Orange();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

/**
 * @Title CovariantArrays.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

/**
 * @ClassName CovariantArrays
 * @Description ͨ���
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		// ����ʱ������Apple[]
		try{
			// ���������������Fruit���������ͨ������������ʱ����
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

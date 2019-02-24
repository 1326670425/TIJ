/**
 * @Title ToyTest.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy(){ super(1); }
}




/**
 * @ClassName ToyTest
 * @Description Class类
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class ToyTest {
	static void printInfo(Class cc){
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonocal name: " + cc.getCanonicalName());//全限定类名，带包路径
	}
	public static void main(String[] args) {
		Class c = null;
		try{
			c = Class.forName("ch14.FancyToy");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		printInfo(c);
		for (Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			obj = up.newInstance();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
		printInfo(obj.getClass());
	}
}

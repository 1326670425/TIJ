/**
 * @Title MyWorld.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;

class House implements Serializable{}
class Animal implements Serializable{
	private String name;
	private House preferredHouse;
	Animal(String nm, House h){
		name = nm;
		preferredHouse = h;
	}
	public String toString(){
		return name + "[" + super.toString() + "], " + preferredHouse + "\n";
	}
}
/**
 * @ClassName MyWorld
 * @Description 通过字节数组来使用对象序列化，实现对任何可Serializable对象的深度复制。
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class MyWorld {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		House house = new House();
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Bosco the dog", house));
		animals.add(new Animal("Ralph the hamster", house));
		animals.add(new Animal("Molly the cat", house));
		print("animals: " + animals);
		ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
		ObjectOutputStream o1 = new ObjectOutputStream(buf1);
		o1.writeObject(animals);
		o1.writeObject(animals);
		// 向另一个流中写入
		ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
		ObjectOutputStream o2 = new ObjectOutputStream(buf2);
		o2.writeObject(animals);
		ObjectInputStream in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
		List
			animals1 = (List)in1.readObject(),
			animals2 = (List)in1.readObject(),
			animals3 = (List)in2.readObject();
		// animal1和animal2中对象地址相同，且共享指向House对象的引用
		print("animals1: " + animals1);
		print("animals2: " + animals2);
		print("animals3: " + animals3);
	}
}

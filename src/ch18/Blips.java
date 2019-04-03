/**
 * @Title Blips.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.io.*;
import static net.mindview.util.Print.*;

class Blip1 implements Externalizable{
	public Blip1(){ print("Blip1 Constructor"); }
	public void writeExternal(ObjectOutput out) throws IOException{
		print("Blip1.wirteExternal");
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		print("Blip1.readExternal");
	}
}

class Blip2 implements Externalizable{
	// 没有public修饰的默认构造器，所以反序列化时出错
	Blip2(){ print("Blip2 Constructor"); }
	public void writeExternal(ObjectOutput out) throws IOException{
		print("Blip2.wirteExternal");
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		print("Blip2.readExternal");
	}
}

/**
 * @ClassName Blips
 * @Description Externalizable接口使用
 * <p>对于Serializable对象，对象完全以它存储的二进制位为基础构造，而不调用构造器。
 * <p>而对于Externalizable对象，所有普通的默认构造器都会被调用，然后调用readExternal()。
 * <p>如果不想实现Externalizable接口，可以实现Serializable接口，并添加writeObject()和readObject()方法。
 * 一旦对象被序列化或反序列化，就会自动调用这两个方法。方法签名必须严格按照如下格式：
 * <pre>
 * private void writeObject(ObjectOutput stream) throws IOException;
 * private void readObject(ObjectInput stream) throws IOException;
 * </pre>
 * ObjectOutputStream和ObjectInputStream对象的writeObject()和readObject()方法来调用。
 * （利用反射可以在类的外部调用类的private方法：ch14.HiddenImplementation.java）
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class Blips {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		print("Constructing objects");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blips.out"));
		print("Saving objects");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blips.out"));
		print("Recovering b1:");
		b1 = (Blip1)in.readObject();
		// 抛出异常
		// print("Revocering b2:");
		// b2 = (Blip2)in.readObject();
	}
}

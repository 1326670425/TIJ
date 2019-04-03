/**
 * @Title Blip3.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Blip3
 * @Description 如何完整的保存和恢复一个Externalizable对象
 * <p>可防止对象的敏感部分被序列化，可以在writeExternal()内部只对所需部分进行显式的序列化
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class Blip3 implements Externalizable{
	private int i;
	private String s;
	// 默认构造器，s、i并没有被初始化
	public Blip3(){ print("Blip3 Constructor"); }
	public Blip3(String x, int 	a){
		s = x;
		i = a;
		// s和i只在非默认构造器中初始化
	}
	public String toString(){ return s + i; }
	public void writeExternal(ObjectOutput out) throws IOException{
		print("Blip3.writeExternal");
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		print("Blip3.readExternal");
		// 必须这样做
		// 因为反序列化时，会调用该函数和默认构造器，而参数不是在默认构造器里初始化的，所以要在这里进行赋值
		s=  (String)in.readObject();
		i = in.readInt();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		print("Constructing objects:");
		Blip3 b3 = new Blip3("A String ", 47);
		print(b3);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
		print("Saving object:");
		o.writeObject(b3);
		o.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blip3.out"));
		print("Recovering b3:");
		b3 = (Blip3)in.readObject();
		print(b3);
	}
}

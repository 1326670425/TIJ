/**
 * @Title SerialCtl.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.io.*;

/**
 * @ClassName SerialCtl
 * @Description 控制Serializable对象的存储和恢复
 * <p>在自己的writeObject()内部，调用defaultWriteObject()选择执行默认的writeObject()。
 * 类似的，在readObject()内部，调用defaultReadObject()。
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class SerialCtl implements Serializable{
	private String a;
	private transient String b;
	public SerialCtl(String aa, String bb){
		a = "Not Transient: " + aa;
		b = "Transient: " + bb;
	}
	public String toString(){ return a + "\n" + b; }
	private void writeObject(ObjectOutputStream stream) throws IOException{
		stream.defaultWriteObject();
		// transient参数可以在此显式序列化
		stream.writeObject(b);
	}
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
		stream.defaultReadObject();
		b = (String)stream.readObject();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		SerialCtl sc = new SerialCtl("Test1", "Test2");
		System.out.println("Before:\n" + sc);
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		ObjectOutputStream o = new ObjectOutputStream(buf);
		// 这里writeObject()方法会利用反射机制检查sc，判断它是否拥有自己的wroteObject()方法，如果有就使用它
		o.writeObject(sc);
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		SerialCtl sc2 = (SerialCtl)in.readObject();
		System.out.println("After:\n" + sc2);
	}
}

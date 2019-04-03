/**
 * @Title Blips.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
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
	// û��public���ε�Ĭ�Ϲ����������Է����л�ʱ����
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
 * @Description Externalizable�ӿ�ʹ��
 * <p>����Serializable���󣬶�����ȫ�����洢�Ķ�����λΪ�������죬�������ù�������
 * <p>������Externalizable����������ͨ��Ĭ�Ϲ��������ᱻ���ã�Ȼ�����readExternal()��
 * <p>�������ʵ��Externalizable�ӿڣ�����ʵ��Serializable�ӿڣ������writeObject()��readObject()������
 * һ���������л������л����ͻ��Զ���������������������ǩ�������ϸ������¸�ʽ��
 * <pre>
 * private void writeObject(ObjectOutput stream) throws IOException;
 * private void readObject(ObjectInput stream) throws IOException;
 * </pre>
 * ObjectOutputStream��ObjectInputStream�����writeObject()��readObject()���������á�
 * �����÷������������ⲿ�������private������ch14.HiddenImplementation.java��
 * @author �����
 * @date 2019��4��3��
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
		// �׳��쳣
		// print("Revocering b2:");
		// b2 = (Blip2)in.readObject();
	}
}

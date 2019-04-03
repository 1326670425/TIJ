/**
 * @Title Blip3.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * @version 1.0
 */
package ch18;
import java.io.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Blip3
 * @Description ��������ı���ͻָ�һ��Externalizable����
 * <p>�ɷ�ֹ��������в��ֱ����л���������writeExternal()�ڲ�ֻ�����貿�ֽ�����ʽ�����л�
 * @author �����
 * @date 2019��4��3��
 * 
 */
public class Blip3 implements Externalizable{
	private int i;
	private String s;
	// Ĭ�Ϲ�������s��i��û�б���ʼ��
	public Blip3(){ print("Blip3 Constructor"); }
	public Blip3(String x, int 	a){
		s = x;
		i = a;
		// s��iֻ�ڷ�Ĭ�Ϲ������г�ʼ��
	}
	public String toString(){ return s + i; }
	public void writeExternal(ObjectOutput out) throws IOException{
		print("Blip3.writeExternal");
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		print("Blip3.readExternal");
		// ����������
		// ��Ϊ�����л�ʱ������øú�����Ĭ�Ϲ�������������������Ĭ�Ϲ��������ʼ���ģ�����Ҫ��������и�ֵ
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

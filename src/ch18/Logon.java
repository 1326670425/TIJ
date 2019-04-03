/**
 * @Title Logon.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * @version 1.0
 */
package ch18;
import java.util.concurrent.*;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName Logon
 * @Description transient�ؼ��֣��ر����л�
 * @author �����
 * @date 2019��4��3��
 * 
 */
public class Logon implements Serializable{
	private Date date = new Date();
	private String username;
	private transient String password;
	public Logon(String name, String pwd){
		username = name;
		password = pwd;
	}
	public String toString(){
		return "Logon info: \n username: " + username + "\n data: " + date + "\n password: " + password;
	}
	public static void main(String[] args) throws Exception{
		Logon a = new Logon("Hulk", "myLittlePony");
		print("logon a = " + a);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
		o.writeObject(a);
		TimeUnit.SECONDS.sleep(1);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
		print("Recovering object at " + new Date());
		a = (Logon)in.readObject();
		print("logon a = " + a);
	}
}

/**
 * @Title Worm.java
 * @Package ch18
 * @Description 对象序列化。它不仅能够保存对象的所有信息，而且能追踪对象内包含的所有引用，并保存那些对象，接着又能对对象内包含的每个
 * 这样的引用进行追踪。形成对象网
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Data implements Serializable {
	  private int n;
	  public Data(int n) { this.n = n; }
	  public String toString() { return Integer.toString(n); }
}

/**
 * @ClassName Worm
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class Worm implements Serializable {
	  private static Random rand = new Random(47);
	  private Data[] d = {
	    new Data(rand.nextInt(10)),
	    new Data(rand.nextInt(10)),
	    new Data(rand.nextInt(10))
	  };
	  private Worm next;
	  private char c;
	  // Value of i == number of segments
	  public Worm(int i, char x) {
	    print("Worm constructor: " + i);
	    c = x;
	    if(--i > 0)
	      next = new Worm(i, (char)(x + 1));
	  }
	  public Worm() {
	    print("Default constructor");
	  }
	  public String toString() {
	    StringBuilder result = new StringBuilder(":");
	    result.append(c);
	    result.append("(");
	    for(Data dat : d)
	      result.append(dat);
	    result.append(")");
	    if(next != null)
	      result.append(next);
	    return result.toString();
	  }
	  public static void main(String[] args)
	  throws ClassNotFoundException, IOException {
	    Worm w = new Worm(6, 'a');
	    print("w = " + w);
	    ObjectOutputStream out = new ObjectOutputStream(
	      new FileOutputStream("worm.out"));
	    out.writeObject("Worm storage\n");
	    out.writeObject(w);
	    out.close(); // Also flushes output
	    ObjectInputStream in = new ObjectInputStream(
	      new FileInputStream("worm.out"));
	    String s = (String)in.readObject();
	    Worm w2 = (Worm)in.readObject();
	    print(s + "w2 = " + w2);
	    ByteArrayOutputStream bout =
	      new ByteArrayOutputStream();
	    ObjectOutputStream out2 = new ObjectOutputStream(bout);
	    out2.writeObject("Worm storage\n");
	    out2.writeObject(w);
	    out2.flush();
	    ObjectInputStream in2 = new ObjectInputStream(
	      new ByteArrayInputStream(bout.toByteArray()));
	    s = (String)in2.readObject();
	    Worm w3 = (Worm)in2.readObject();
	    print(s + "w3 = " + w3);
	  }
}

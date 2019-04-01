/**
 * @Title CanonicalMapping.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;
import java.util.*;

class Element {
	  private String ident;
	  public Element(String id) { ident = id; }
	  public String toString() { return ident; }
	  public int hashCode() { return ident.hashCode(); }
	  public boolean equals(Object r) {
	    return r instanceof Element &&
	      ident.equals(((Element)r).ident);
	  }
	  protected void finalize() {
	    System.out.println("Finalizing " +
	      getClass().getSimpleName() + " " + ident);
	  }
	}

	class Key extends Element {
	  public Key(String id) { super(id); }
	}

	class Value extends Element {
	  public Value(String id) { super(id); }
	}


/**
 * @ClassName CanonicalMapping
 * @Description WeakHashMap：用来保存WeakReference。在这种映射中，每个值只保存一份实例以节省存储空间。
 * 当程序需要那个值的时候，便在映射中查询现有的对象，然后使用它。
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class CanonicalMapping {
	public static void main(String[] args) {
	    int size = 100;
	    // Or, choose size via the command line:
	    if(args.length > 0)
	      size = new Integer(args[0]);
	    Key[] keys = new Key[size];
	    WeakHashMap<Key,Value> map =
	      new WeakHashMap<Key,Value>();
	    for(int i = 0; i < size; i++) {
	      Key k = new Key(Integer.toString(i));
	      Value v = new Value(Integer.toString(i));
	      // 结果中垃圾回收器每隔三个键就跳过一个，因为指向那个键的普通引用被存储到了keys数组，所以那些对象不能被回收
	      if(i % 3 == 0)
	        keys[i] = k; // Save as "real" references
	      map.put(k, v);
	    }
	    System.gc();
	  }
}

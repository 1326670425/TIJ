/**
 * @Title CanonicalMapping.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
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
 * @Description WeakHashMap����������WeakReference��������ӳ���У�ÿ��ֵֻ����һ��ʵ���Խ�ʡ�洢�ռ䡣
 * ��������Ҫ�Ǹ�ֵ��ʱ�򣬱���ӳ���в�ѯ���еĶ���Ȼ��ʹ������
 * @author �����
 * @date 2019��4��1��
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
	      // ���������������ÿ��������������һ������Ϊָ���Ǹ�������ͨ���ñ��洢����keys���飬������Щ�����ܱ�����
	      if(i % 3 == 0)
	        keys[i] = k; // Save as "real" references
	      map.put(k, v);
	    }
	    System.gc();
	  }
}

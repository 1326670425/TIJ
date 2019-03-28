/**
 * @Title Decoration.java
 * @Package ch15.decorator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15.decorator;
import java.util.*;

class Basic{
	private String value;
	public void set(String val){ value = val; }
	public String get(){ return value; }
}

class Decorator extends Basic{
	protected Basic basic;
	public Decorator(Basic basic){ this.basic = basic; }
	public void set(String val){ basic.set(val); }
	public String get(){ return basic.get(); }
}

class TimeStamped extends Decorator{
	private final long timeStamp;
	public TimeStamped(Basic basic){
		super(basic);
		timeStamp = new Date().getTime();
	}
	public long getStamp(){ return timeStamp; }
}

class SerialNumbered extends Decorator{
	private static long counter = 1;
	private final long serialNumer = counter++;
	public SerialNumbered(Basic basic){ super(basic); }
	public long getSerialNumber(){ return serialNumer; }
}

/**
 * @ClassName Decoration
 * @Description 混型  装饰器
 * <p>产生自泛型的类包含所有感兴趣的方法，但是由装饰器所产生的对象类型是最后被装饰的类型。也就是说，尽管可以添加多个层，但是最后一层才是实际的类型，
 * 因此只有最后一层的方法是可视的。而混型的类型是所有被混合到一起的类型。因此对装饰器来说，最大缺陷是它只能有效的工作于装饰器的最后一层
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class Decoration {
	public static void main(String[] args) {
		TimeStamped t = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
		// t2.getSerialNumber(); // 不可访问
		SerialNumbered s = new SerialNumbered(new Basic());
		SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
		// s2.getTimeStamp(); //不可访问
	}
}

/**
 * @Title Mixins.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.sql.Time;
import java.util.*;
interface TimeStamped { long getStamp(); }
class TimeStampedImp implements TimeStamped{
	private final long timeStamp;
	public TimeStampedImp(){
		timeStamp = new Date().getTime();
	}
	public long getStamp(){ return timeStamp; }
}

interface SerialNumbered{ long getSerialNumber(); }
class SerialNumberedImp implements SerialNumbered{
	private static long counter = 1;
	private final long serialNumer = counter++;
	public long getSerialNumber(){ return serialNumer; }
}

interface Basic{
	public void set(String val);
	public String get();
}

class BasicImp implements Basic{
	private String value;
	public void set(String val){ value = val; }
	public String get(){ return value; }
}
// 该类基本上是在使用代理，因此每个混入类型都要求在Mixin中有一个对应的域。
// 而且必须在Mixin中编写所有必须的方法，将方法调用转发给恰当的对象
class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	public long getStamp(){ return timeStamp.getStamp(); }
	public long getSerialNumber(){ return serialNumber.getSerialNumber(); }
}

/**
 * @ClassName Mixins
 * @Description 由于擦除的存在，Java不能像C++那样使用混型。一种推荐方案是使用接口来产生混型效果。
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class Mixins {
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
	}
}

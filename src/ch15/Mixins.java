/**
 * @Title Mixins.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
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
// �������������ʹ�ô������ÿ���������Ͷ�Ҫ����Mixin����һ����Ӧ����
// ���ұ�����Mixin�б�д���б���ķ���������������ת����ǡ���Ķ���
class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	public long getStamp(){ return timeStamp.getStamp(); }
	public long getSerialNumber(){ return serialNumber.getSerialNumber(); }
}

/**
 * @ClassName Mixins
 * @Description ���ڲ����Ĵ��ڣ�Java������C++����ʹ�û��͡�һ���Ƽ�������ʹ�ýӿ�����������Ч����
 * @author �����
 * @date 2019��3��28��
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

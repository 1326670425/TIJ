/**
 * @Title ClassInitialization.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;
import java.util.*;

class Initable{
	static final int staticFinal = 47;
	static final int staticFianl2 = ClassInitialization.rand.nextInt(1000);
	static{
		System.out.println("Initializing Initable");
	}
}

class Initable2{
	static int staticNonFinal = 147;
	static{
		System.out.println("Initializing Initable2");
	}
}

class Initable3{
	static int staticNonFinal = 74;
	static{
		System.out.println("Initializing Initable3");
	}
}
/**
 * @ClassName ClassInitialization
 * @Description �����泣��
 * <p>���ɶ�Class��������ã����ַ����ڱ���ʱ���ܼ�飬����Ҫ����try�����У����Class.forName()����Ч��
 * <p>ʹ��".class"������Class���������ʱ�������Զ���ʼ����Class����Ϊ��ʹ���������׼������ʵ�ʰ����������裺
 * <p>1.���ء� �������������ִ�еġ������ֽ��룬������Щ�ֽ����д���һ��Class����
 * <p>2.���ӡ� �����ӽ׶ν���֤���е��ֽ��룬Ϊ��̬�����ռ䣬���������Ҫ�Ļ�������������ഴ���Ķ���������������á�
 * <p>3.��ʼ���� ��������г��࣬������ʼ����ִ�о�̬��ʼ�����;�̬��ʼ���顣
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class ClassInitialization {
	public static Random rand = new Random(47);
	/**
	 * ʹ��.class������ö�������ò���������ʼ������Class.forName()�����ͽ��г�ʼ����
	 * ���һ��static finalֵ�ǡ������ڳ���������ô���ֵ����Ҫ������г�ʼ���Ϳ��Ա���ȡ����Initable.staticFinalһ����
	 * <p>�������ֻ�ǽ�һ��������Ϊstatic��final�ģ� ��������ȷ����������Initable.staticFinal2��
	 * <p>���һ��static����final�ģ���ô�ڶ�ȡ��֮ǰ������Ҫ�ȶ�����г�ʼ��
	 */
	
	public static void main(String[] args) throws Exception{
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFianl2);
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("ch14.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}

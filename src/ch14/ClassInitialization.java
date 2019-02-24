/**
 * @Title ClassInitialization.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
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
 * @Description 类字面常量
 * <p>生成对Class对象的引用，这种方法在编译时接受检查，不需要置于try语句块中，相比Class.forName()更高效。
 * <p>使用".class"创建对Class对象的引用时，不会自动初始化该Class对象。为了使用类而做的准备工作实际包含三个步骤：
 * <p>1.加载。 这是由类加载器执行的。查找字节码，并从这些字节码中创建一个Class对象
 * <p>2.链接。 在链接阶段将验证类中的字节码，为静态域分配空间，并且如果必要的话，将解析这个类创建的对其它类的所有引用。
 * <p>3.初始化。 如果该类有超类，则对其初始化，执行静态初始化器和静态初始化块。
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class ClassInitialization {
	public static Random rand = new Random(47);
	/**
	 * 使用.class方法获得对类的引用不会引发初始化，而Class.forName()立即就进行初始化。
	 * 如果一个static final值是“编译期常量”，那么这个值不需要对类进行初始化就可以被读取，如Initable.staticFinal一样。
	 * <p>但是如果只是将一个域设置为static和final的， 还不足以确保这样，如Initable.staticFinal2。
	 * <p>如果一个static域不是final的，那么在读取它之前，总是要先对类进行初始化
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

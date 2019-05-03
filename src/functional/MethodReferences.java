/**
 * @Title MethodReferences.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;
import java.util.*;

interface Callable {// 从单一方法接口开始
	void call(String s);
}

class Describe {
	void show(String msg) {// show的签名（参数类型和返回类型）符合call的签名
		System.out.println(msg);
	}
}

/**
 * @ClassName MethodReferences
 * @Description 方法引用：类名或对象名  加 :: 加 方法名称
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class MethodReferences {
	static void hello(String name) {// 也符合call的签名
		System.out.println("Hello, " + name);
	}
	static class Description {
		String about;
		Description(String desc) { about = desc; }
		void help(String msg) {// 静态类中的非静态方法
			System.out.println(about + " " + msg);
		}
	}
	static class Helper {
		static void assist(String msg) {// 静态类中的静态方法
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		Describe d = new Describe();
		// 将Describe对象的方法引用赋值给Callable，虽然Callable没有show()方法，
		// 但是show()的方法签名符合call()方法的，所以Java接受这样的赋值
		Callable c = d :: show;
		// 通过调用call()来调用show()，Java将call()映射到show()
		c.call("call()");
		
		// 静态方法引用
		c = MethodReferences::hello;
		c.call("Bob");
		
		c = new Description("valuable")::help;
		c.call("information");
		
		c = Helper::assist;
		c.call("Help!");
	}
}

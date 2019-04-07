/**
 * @Title Reflection.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19;
import java.lang.reflect.*;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

enum Explore{ HERE, THERE }

/**
 * @ClassName Reflection
 * @Description 利用反射探究Enum的value()
 * <p>values()是由编译器添加的static方法，并且还创建了valueOf()方法
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public class Reflection {
	public static Set<String> analyze(Class<?> enumClass){
		print("-----Analyzing " + enumClass + " -----");
		print("Interfaces:");
		for(Type t : enumClass.getGenericInterfaces())
			print(t);
		print("Base: " + enumClass.getSuperclass());
		print("Methods:");
		Set<String> methods = new TreeSet<String>();
		for(Method m : enumClass.getMethods())
				methods.add(m.getName());
		print(methods);
		return methods;
	}
	public static void main(String[] args) {
		Set<String> exploreMethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
		print("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
		printnb("Explore.removeAll(Enum): " + exploreMethods.removeAll(enumMethods));
		print(exploreMethods);
		// Decompile the code for the enum
		OSExecute.command("javap Explore");
	}
}

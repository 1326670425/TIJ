/**
 * @Title Reflection.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
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
 * @Description ���÷���̽��Enum��value()
 * <p>values()���ɱ�������ӵ�static���������һ�������valueOf()����
 * @author �����
 * @date 2019��4��7��
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

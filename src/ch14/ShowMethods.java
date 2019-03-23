/**
 * @Title ShowMethods.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.lang.reflect.*;
import java.util.regex.*;
/**
 * @ClassName ShowMethods
 * @Description RTTI和反射的真正区别在于：对RTTI来说，编译器在编译时打开和检查.class文件（换句话说，我们可以用普通方式调用对象的所有方法）；
 * <p>而对于反射机制，.class文件在编译时是不可获取的，所以在运行时打开和检查.class文件
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class ShowMethods {
	private static String usage = "usage:\nShowMethods qualified.class.name\n" +
								"To show all methods in class or:\n" +
								"ShowMethods qualified.class.name word\n" +
								"To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println(usage);
			System.exit(0);
		}
		int lines = 0;
		try{
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1){
				for(Method method : methods)
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				for(Constructor ctor : ctors)
					System.out.println(p.matcher(ctor.toString()).replaceAll(""));
				lines = methods.length + ctors.length;
			}else{
				for(Method method : methods)
					if(method.toString().indexOf(args[1]) != -1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				for(Constructor ctor : ctors)
					if(ctor.toString().indexOf(args[1]) != -1){
						System.out.println(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
					}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

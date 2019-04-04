/**
 * @Title EnumClass.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;

enum Shrubbery{ GROUND,  CRAWLING, HANGING }

/**
 * @ClassName EnumClass
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * 
 */
public class EnumClass {
	public static void main(String[] args) {
		for(Shrubbery s : Shrubbery.values()){
			// 返回enum实例在声明时的次序，从0开始
			print(s + " ordinal: " + s.ordinal());
			printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
			printnb(s.equals(Shrubbery.CRAWLING) + " ");
			// 可以使用==来比较enum实例
			print(s == Shrubbery.CRAWLING);
			print(s.getDeclaringClass());
			print(s.name());
			print("--------------------");
		}
		// 从字符串中产生枚举类型
		for(String s : "HANGING CRAWLING GROUND".split(" ")){
			// 根据给定的名字返回对应的enum实例，如果不存在给定名字的实例则抛出异常
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
			print(shrub);
		}
	}
}

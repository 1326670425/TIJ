/**
 * @Title LocalInnerClass.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch10;

interface Counter{
	int next();
}

/**
 * @ClassName LocalInnerClass
 * @Description 局部内部类：没有访问说明符，因为它不是外围类的一部分，但是它可以访问当前代码块内的常量以及外围类的所有成员
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class LocalInnerClass {
	private int count = 0;
	Counter getCounter(final String name){
		// 一个局部内部类
		class LocalCounter implements Counter{
			public LocalCounter(){
				// 局部内部类可以有构造器
				System.out.println("LocalCounter");
			}
			public int next(){
				System.out.print(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name){
		return new Counter(){
			// 匿名内部类不能有一个命名构造器，只有一个实例程序。
			{ System.out.println("Counter()"); }
			public int next(){
				System.out.print(name);
				return count++;
			}
		};
	}
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter 
			c1 = lic.getCounter("Local inner "),
			c2 = lic.getCounter2("Anonymous inner ");
			for (int i = 0; i < 5; i++) {
				System.out.println(c1.next());
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(c2.next());
			}
	}
}
// 使用局部内部类而不是匿名内部类的情况：
// (1) 需要一个已命名的构造器，或者需要重载构造器，而匿名内部类只能用于实例初始化；
// (2) 需要不止一个该内部类对象。

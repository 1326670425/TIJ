/**
 * @Title Strategize.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

import ch21.MainThread;

interface Strategy {
	String approach(String msg);
}

class Soft implements Strategy {
	public String approach(String msg) {
		return msg.toLowerCase() + "?";
	}
}

class Unrelated {
	static String twice(String msg) {
		return msg + " " + msg;
	}
}

/**
 * @ClassName Strategize
 * @Description 函数式编程新旧方式对比
 * <p>传统方式：（1）实现接口来创建不同的行为（2）匿名内部类
 * <p>Lambda表达式：由 -> 分隔开参数和函数体，箭头左边是参数，右边是从Lambda返回的表达式，即函数体。
 * <p>方法引用：由 :: 区分，左边是类或对象的名称，右边是方法名称，没有参数列表
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class Strategize {
	Strategy strategy;
	String msg;
	Strategize(String msg) {
		strategy = new Soft();
		this.msg = msg;
	}
	
	void communicate() {
		System.out.println(strategy.approach(msg));
	}
	
	void changeStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public static void main(String[] args) {
		Strategy[] strategies = {
				new Strategy() {
					public String approach(String msg) {
						return msg.toUpperCase() + "!";
					}
				},							// 匿名内部类方式
				msg -> msg.substring(0, 5), //Lambda表达式
				Unrelated::twice			// 方法引用
		};
		Strategize s = new Strategize("Hello there");
		s.communicate();
		for(Strategy newStrategy : strategies) {
			s.changeStrategy(newStrategy);
			s.communicate();
		}
	}
}

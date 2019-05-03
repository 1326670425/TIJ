/**
 * @Title FunctionalAnnotation.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

@FunctionalInterface
interface Functional {
	String goodbye(String arg);
}

interface FunctionalNoAnn {
	String goodbye(String arg);
}

/*
@FunctionalInterface
interface NotFunctional {
	String goodbye(String arg);
	String hello(String arg);
}
产生错误信息：
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFuntional
*/


/**
 * @ClassName FunctionalAnnotation
 * @Description 函数式接口
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class FunctionalAnnotation {
	public String goodbye(String arg) {
		return "Goodbye, " + arg;
	}
	public static void main(String[] args) {
		FunctionalAnnotation fa = new FunctionalAnnotation();
		Functional f = fa::goodbye;
		FunctionalNoAnn fna = fa::goodbye;
		// Functional fac = fa; // Incompatible
		Functional fl = a -> "Goodbye, " + a;
		FunctionalNoAnn fnal = a -> "Goodbye, " + a;
	}
}

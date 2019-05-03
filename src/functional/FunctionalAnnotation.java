/**
 * @Title FunctionalAnnotation.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
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
����������Ϣ��
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFuntional
*/


/**
 * @ClassName FunctionalAnnotation
 * @Description ����ʽ�ӿ�
 * @author �����
 * @date 2019��5��3��
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

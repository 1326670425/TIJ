/**
 * @Title MultiUnbound.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

class This {
	void two(int i, double d) {}
	void three(int i, double d, String s) {}
	void four(int i, double d, String s, char c) {}
}

interface TwoArgs {
	void call2(This athis, int i, double d);
}

interface ThreeArgs {
	void call3(This athis, int i, double d, String s);
}

interface FourArgs {
	void call4(This athis, int i, double d, String s, char c);
}

/**
 * @ClassName MultiUnbound
 * @Description 未绑定的方法与多参数的结合运用
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class MultiUnbound {
	public static void main(String[] args) {
		TwoArgs twoargs = This::two;
		ThreeArgs threeargs = This::three;
		FourArgs fourargs = This::four;
		This athis = new This();
		twoargs.call2(athis, 11, 3.14);
		threeargs.call3(athis, 11, 3.14, "Three");
		fourargs.call4(athis, 11, 3.14, "Four", 'Z');
	}
}

/**
 * @Title LambdaExpressions.java
 * @Package functional
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月3日
 * @version 1.0
 */
package functional;

interface Description {
	String brief();
}

interface Body {
	String detailed(String head);
}

interface Multi {
	String twoArg(String head, Double d);
}

/**
 * @ClassName LambdaExpressions
 * @Description Lambda表达式语法
 * <p>任何Lambda表达式的基本语法都是：
 * <ol>
 *   <li>参数
 *   <li> ->，可以看做生成，产出
 *   <li> -> 之后的内容都是方法体
 * </ol>
 * <br>
 * <ul>
 *   <li>当只有一个参数，可以不需要括号
 *   <li>正常情况下使用括号包裹参数，为了保持一致性，也可以使用括号包裹单个参数
 *   <li>如果没有参数，必须使用括号表示空参数列表
 *   <li>对于多个参数，将参数列表放在括号中
 * </ul>
 * @author 吴扬颉
 * @date 2019年5月3日
 * 
 */
public class LambdaExpressions {
	static Body bod = h -> h + "No Parens";
	static Body bod2 = (h) -> h + "More details";
	static Description desc = () -> "Short info";
	static Multi mult = (h, n) -> h + n;
	static Description moreLines = () -> {
		System.out.println("moreLines()");
		return "from moreLines()";
	};
	
	public static void main(String[] args) {
		System.out.println(bod.detailed("Oh!"));
		System.out.println(bod2.detailed("Hi!"));
		System.out.println(desc.brief());
		System.out.println(mult.twoArg("Pi! ", 3.14159));
		System.out.println(moreLines.brief());
	}
}

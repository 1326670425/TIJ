/**
 * @Title Apply.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch09;

import java.util.Arrays;

class Processor{
	public String name(){ return getClass().getSimpleName(); }
	Object process(Object input) { return input; }
}
class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}


/**
 * @ClassName Apply
 * @Description ��ȫ����������ģʽ
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class Apply {
	public static void process(Processor p, Object s){
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "I believe I can fly";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}

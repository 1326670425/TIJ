/**
 * @Title BlankFinal.java
 * @Package ch07
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月4日
 * @version 1.0
 */
package ch07;

/**
 * @ClassName BlankFinal
 * @Description 空白final，一个类中的final域可以做到根据对象而有所不同，却又保持其恒定不变的特性
 * @author 吴扬颉
 * @date 2019年1月4日
 * 
 */
class Poppet{
	private int i;
	Poppet(int ii){
		i = ii;
		System.out.println("加载基类");
	}
}
public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final Poppet p;
	//空白final必须在定义处或者构造函数中初始化
	public BlankFinal(){
		j = 1;
		p = new Poppet(2);
		System.out.println("无参构造函数");
	}
	public BlankFinal(int x){
		j = x;
		p = new Poppet(x);
		System.out.println("有参构造函数");
	}
	public static void main(String[] args){
		new BlankFinal();
		new BlankFinal(1);
	}
}

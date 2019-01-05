/**
 * @Title CovariantReturn.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch08;

class Grain{
	public String toString(){
		return "Grain";
	}
}
class Wheat extends Grain{
	public String toString(){
		return "Wheat";
	}
}
class Mill{
	Grain process(){ return new Grain(); }
}
class WheatMill extends Mill{
	Wheat process(){ return new Wheat(); }
}

/**
 * @ClassName CovariantReturn
 * @Description 协变返回类型，表示在导出类中的被覆盖方法可以返回基类方法的返回类型的某个导出类型
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}

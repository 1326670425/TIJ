/**
 * @Title BigEgg.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch10;

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){ System.out.println("Egg.Yolk()"); }
	}
	public Egg(){
		System.out.println("New Egg()");
		y = new Yolk();
	}
}

/**
 * @ClassName BigEgg
 * @Description 尝试覆盖内部类
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
// 当继承了某个外围类的时候，内部类并没有发生什么特别的变化。这两个内部类是完全独立的两个实体，各自在自己的命名空间里。
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){ System.out.println("BigEgg.Yolk()"); }
	}
	public static void main(String[] args) {
		new BigEgg();
	}
}

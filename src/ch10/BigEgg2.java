/**
 * @Title BigEgg2.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch10;

class Egg2{
	protected class Yolk{
		public Yolk(){ System.out.println("Egg2.Yolk()"); }
		public void f(){ System.out.println("Egg2.Yolk().f()");
		}
	}
	private Yolk y = new Yolk();
	public Egg2(){System.out.println("New Egg2()");}
	public void insertYolk(Yolk yy){ y = yy; }
	public void g(){ y.f(); }
}

/**
 * @ClassName BigEgg2
 * @Description 明确继承某个内部类
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class BigEgg2 extends Egg2{
	public class Yolk extends Egg2.Yolk{
		public Yolk(){ System.out.println("BigEgg2.Yolk()"); }
		public void f(){ System.out.println("BigEgg2.Yolk.f()"); }
	}
	public BigEgg2(){ insertYolk(new Yolk()); }
	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
		e2.g();
	}
}

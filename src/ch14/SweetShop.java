/**
 * @Title SweetShop.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

class Candy{
	static { System.out.println("Loading Candy"); }
}

class Gum{
	static { System.out.println("Loading Gum"); }
}

class Cookie{
	static { System.out.println("Loading Cookie"); }
}

/**
 * @ClassName SweetShop
 * @Description 类加载器的工作演示
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try{
			Class.forName("ch14.Gum");
		}catch(ClassNotFoundException e){
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating cookie");
	}
}

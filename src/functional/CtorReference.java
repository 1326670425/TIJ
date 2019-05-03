/**
 * @Title CtorReference.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

class Dog {
	String name;
	int age = -1;
	Dog() { name = "stray"; }
	Dog(String nm) { name = nm; }
	Dog(String nm, int yrs) { name = nm; age = yrs; }
}

interface MakeNoArgs {
	Dog make();
}

interface Make1Arg {
	Dog make(String nm);
}

interface Make2Args {
	Dog make(String nm, int age);
}

/**
 * @ClassName CtorReference
 * @Description ���췽������
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class CtorReference {
	public static void main(String[] args) {
		MakeNoArgs mna = Dog::new;
		Make1Arg m1a = Dog::new;
		Make2Args m2a = Dog::new;
		
		Dog dn = mna.make();
		Dog d1 = m1a.make("Comet");
		Dog d2 = m2a.make("Ralph", 4);
	}
}

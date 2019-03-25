/**
 * @Title BankTeller.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.util.*;

class Customer{
	private static long counter = 1;
	private final long id = counter++;
	private Customer(){}
	public String toString(){ return "Customer " + id; }
	//一个产生Generator对象的方法
	public static Generator<Customer> generator(){
		return new Generator<Customer>(){
			public Customer next(){ return new Customer(); }
		};
	}
}

class Teller{
	private static long counter = 1;
	private final long id = counter++;
	private Teller(){}
	public String toString(){ return "Teller " + id; }
	//一个Generator对象
	public static Generator<Teller> generator = new Generator<Teller>(){
		public Teller next(){ return new Teller(); }
	};
}

/**
 * @ClassName BankTeller
 * @Description 将泛型用于匿名内部类，实现Generator接口
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class BankTeller {
	public static void serve(Teller t, Customer c){
		System.out.println(t + " serves " + c);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c : line)
			serve(tellers.get(rand.nextInt(tellers.size())), c);
	}
}

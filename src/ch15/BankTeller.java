/**
 * @Title BankTeller.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;
import java.util.*;

class Customer{
	private static long counter = 1;
	private final long id = counter++;
	private Customer(){}
	public String toString(){ return "Customer " + id; }
	//һ������Generator����ķ���
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
	//һ��Generator����
	public static Generator<Teller> generator = new Generator<Teller>(){
		public Teller next(){ return new Teller(); }
	};
}

/**
 * @ClassName BankTeller
 * @Description ���������������ڲ��࣬ʵ��Generator�ӿ�
 * @author �����
 * @date 2019��3��25��
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

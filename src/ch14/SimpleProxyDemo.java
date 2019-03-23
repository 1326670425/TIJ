/**
 * @Title SimpleProxyDemo.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;

interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface{
	public void doSomething(){ System.out.println("doSomething"); }
	public void somethingElse(String arg){ System.out.println("somethingElse " + arg); }
}

class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	public void doSomething(){
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}
	public void somethingElse(String arg){
		System.out.println("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
}
/**
 * @ClassName SimpleProxyDemo
 * @Description 代理设计模式<p>它是你为了提供额外的或不同的操作，而插入的用来代替实际对象的对象。
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class SimpleProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}

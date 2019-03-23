/**
 * @Title SimpleProxyDemo.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
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
 * @Description �������ģʽ<p>������Ϊ���ṩ����Ļ�ͬ�Ĳ��������������������ʵ�ʶ���Ķ���
 * @author �����
 * @date 2019��3��23��
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

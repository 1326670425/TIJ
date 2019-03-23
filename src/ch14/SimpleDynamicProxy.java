/**
 * @Title SimpleDynamicProxy.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
		if(args != null)
			for(Object arg : args)
				System.out.println(" " + arg);
		return method.invoke(proxied, args);
	}
}

/**
 * @ClassName SimpleDynamicProxy
 * @Description 动态代理
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		// Insert a proxy and call again
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[]{Interface.class}, 
				new DynamicProxyHandler(real));
		consumer(proxy);
	}
}

/**
 * @Title DynamicProxyMixin.java
 * @Package ch15.decorator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Tuple.*;
/**
 * @ClassName DynamicProxyMixin
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
class MixinProxy implements InvocationHandler {
	  Map<String,Object> delegatesByMethod;
	  public MixinProxy(net.mindview.util.TwoTuple<Object,Class<?>>... pairs) {
	    delegatesByMethod = new HashMap<String,Object>();
	    for(net.mindview.util.TwoTuple<Object,Class<?>> pair : pairs) {
	      for(Method method : pair.second.getMethods()) {
	        String methodName = method.getName();
	        // The first interface in the map
	        // implements the method.
	        if (!delegatesByMethod.containsKey(methodName))
	          delegatesByMethod.put(methodName, pair.first);
	      }
	    }
	  }	
	  public Object invoke(Object proxy, Method method,
	    Object[] args) throws Throwable {
	    String methodName = method.getName();
	    Object delegate = delegatesByMethod.get(methodName);
	    return method.invoke(delegate, args);
	  }
	  @SuppressWarnings("unchecked")
	  public static Object newInstance(net.mindview.util.TwoTuple... pairs) {
	    Class[] interfaces = new Class[pairs.length];
	    for(int i = 0; i < pairs.length; i++) {
	      interfaces[i] = (Class)pairs[i].second;
	    }
	    ClassLoader cl =
	      pairs[0].first.getClass().getClassLoader();
	    return Proxy.newProxyInstance(
	      cl, interfaces, new MixinProxy(pairs));
	  }
	}	

	public class DynamicProxyMixin {
	  public static void main(String[] args) {
	    Object mixin = MixinProxy.newInstance(
	      tuple(new BasicImp(), Basic.class),
	      tuple(new TimeStampedImp(), TimeStamped.class),
	      tuple(new SerialNumberedImp(),SerialNumbered.class));
	    Basic b = (Basic)mixin;
	    TimeStamped t = (TimeStamped)mixin;
	    SerialNumbered s = (SerialNumbered)mixin;
	    b.set("Hello");
	    System.out.println(b.get());
	    System.out.println(t.getStamp());
	    System.out.println(s.getSerialNumber());
	  }
	}
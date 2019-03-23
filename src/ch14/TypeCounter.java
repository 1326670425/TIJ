/**
 * @Title TypeCounter.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.util.*;
/**
 * @ClassName TypeCounter
 * @Description 通用的类型计数工具。isAssignableFrom方法执行运行时检查，以校验传递的对象是否属于所需的继承结构
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class TypeCounter extends HashMap<Class<?>, Integer>{
	private Class<?> baseType;
	public TypeCounter(Class<?> baseType){
		this.baseType = baseType;
	}
	public void count(Object obj){
		Class<?> type = obj.getClass();
		if(!baseType.isAssignableFrom(type))
			throw new RuntimeException(obj + " incorrect type: " + type + ", should be type or subtype of " + baseType);
		countClass(type);
	}
	private void countClass(Class<?> type){
		Integer quantity = get(type);
		put(type, quantity == null ? 1 : quantity + 1);
		Class<?> superClass = type.getSuperclass();
		if(superClass != null && baseType.isAssignableFrom(superClass))
			countClass(superClass);
	}
	public String toString(){
		StringBuilder result = new StringBuilder("{");
		for(Map.Entry<Class<?>, Integer> pair : entrySet()){
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(", ");
		}
		//去除后边多余的", "两个字符
		result.delete(result.length() - 2, result.length());
		result.append("}");
		return result.toString();
	}
}

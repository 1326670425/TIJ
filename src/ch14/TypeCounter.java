/**
 * @Title TypeCounter.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��3��23��
 * @version 1.0
 */
package ch14;
import java.util.*;
/**
 * @ClassName TypeCounter
 * @Description ͨ�õ����ͼ������ߡ�isAssignableFrom����ִ������ʱ��飬��У�鴫�ݵĶ����Ƿ���������ļ̳нṹ
 * @author �����
 * @date 2019��3��23��
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
		//ȥ����߶����", "�����ַ�
		result.delete(result.length() - 2, result.length());
		result.append("}");
		return result.toString();
	}
}

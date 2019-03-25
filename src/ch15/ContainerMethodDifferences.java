/**
 * @Title ContainerMethodDifferences.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import java.lang.reflect.*;
import java.util.*;
/**
 * @ClassName ContainerMethodDifferences
 * @Description 打印java.util包中的各种Collection类和Map类之间的方法差异
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class ContainerMethodDifferences {
	static Set<String> methodSet(Class<?> type){
		Set<String> result = new TreeSet<String>();
		for(Method m : type.getMethods())
			result.add(m.getName());
		return result;
	}
	static void interfeces(Class<?> type){
		System.out.println("Interface in " + type.getSimpleName() + ": ");
		List<String> result = new ArrayList<String>();
		for(Class<?> c : type.getInterfaces())
			result.add(c.getSimpleName());
		System.out.println(result);
	}
	static Set<String> object = methodSet(Object.class);
	static { object.add("clone"); }
	static void difference(Class<?> superset, Class<?> subset){
		System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
		Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
		comp.removeAll(object);//不展示Object的方法
		System.out.println(comp);
		interfeces(superset);
	}
	public static void main(String[] args) {
		System.out.println("Collection: " + methodSet(Collection.class));
		interfeces(Collection.class);
		difference(Set.class, Collection.class);
		difference(HashSet.class, Set.class);
		difference(LinkedHashSet.class, HashSet.class);
		difference(TreeSet.class, Set.class);
		difference(List.class, Collection.class);
		difference(ArrayList.class, List.class);
		difference(LinkedList.class, List.class);
		difference(Queue.class, Collection.class);
		difference(PriorityQueue.class, Queue.class);
		System.out.println("Map: " + methodSet(Map.class));
		difference(HashMap.class, Map.class);
		difference(LinkedHashMap.class, HashMap.class);
		difference(SortedMap.class, Map.class);
		difference(TreeMap.class, Map.class);
	}
}

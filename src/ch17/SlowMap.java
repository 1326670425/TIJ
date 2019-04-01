/**
 * @Title SlowMap.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;
/**
 * @ClassName SlowMap
 * @Description 用两个ArrayList实现Map
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	public V put(K key, V value){
		V oldvalue = get(key);
		if(!keys.contains(key))
			values.add(value);
		else
			values.set(keys.indexOf(key), value);
		return oldvalue;
	}
	public V get(Object key){// key is type Object, not K
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	public Set<Map.Entry<K, V>> entrySet(){
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext())
			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		return set;
	}
	
}

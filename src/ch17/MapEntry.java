/**
 * @Title MapEntry.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.*;
/**
 * @ClassName MapEntry
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;
	public MapEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	public K getKey(){ return key; }
	public V getValue(){ return value; }
	public V setValue(V v){
		V result = value;
		value = v;
		return result;
	}
	public int hashCode(){
		return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
	}
	@SuppressWarnings("rawtypes")
	public boolean equlas(Object o){
		if(!(o instanceof MapEntry))
			return false;
		MapEntry me = (MapEntry)o;
		return (key == null ? me.getKey() == null : key.equals(me.getKey())) &&
				(value == null ? me.getValue() == null : value.equals(me.getValue()));
	}
	public String toString(){
		return key + "=" + value; 
	}
}

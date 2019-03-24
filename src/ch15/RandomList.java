/**
 * @Title RandomList.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName RandomList
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item){ storage.add(item); }
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s : ("The quick brown fox jumped over the lazy brown dog").split(" "))
			rs.add(s);
		for(int i = 0; i < 11; i++)
			System.out.println(rs.select() + " ");
	}
}

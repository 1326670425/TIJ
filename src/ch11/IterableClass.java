/**
 * @Title IterableClass.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName IterableClass
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class IterableClass implements Iterable<String>{
	protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index = 0;
			public boolean hasNext(){
				return index < words.length;
			}
			public String next(){ return words[index++]; }
			public void remove(){ throw new UnsupportedOperationException(); }
		};
	}
	public static void main(String[] args) {
		for(String s : new IterableClass())
			System.out.print(s + " ");
	}
}

/**
 * @Title MultiIterableClass.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName MultiIterableClass
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class MultiIterableClass extends IterableClass{
	public Iterable<String> reversed(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				return new Iterator<String>(){
					int current = words.length - 1;
					public boolean hasNext(){ return current > -1; }
					public String next(){ return words[current--]; }
					public void remove(){ throw new UnsupportedOperationException(); }
				};
			}
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				List<String> shuffled = 
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));//打乱List，知识打乱了shuffled中的引用，没有影响到原来的数组
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for(String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic)
			System.out.print(s + " ");
	}
}
// Collection.shuffle()方法没有影响到原来的数组，而只是打乱了shuffled中的引用。之所以这样，只是因为randomized()方法
// 用一个ArrayList将Arrays.asList()方法的结果包装了起来。如果这个由Arrays.asList()方法产生的List被直接打乱，那么它就会修改底层的数组

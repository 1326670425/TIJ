/**
 * @Title MapDataTest.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch17;
import java.util.*;
import net.mindview.util.*;

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer>{

	private int size = 9;
	private int number = 1;
	private char letter = 'A';
	public Pair<Integer, String> next(){
		return new Pair<Integer, String>(number++, "" + letter++);
	}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public Integer next(){ return number++; }
			public boolean hasNext(){ return number < size; }
			public void remove(){ throw new UnsupportedOperationException(); }
		};
	}
}

/**
 * @ClassName MapDataTest
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class MapDataTest {
	public static void main(String[] args) {
		// Pair Generator
		System.out.println(MapData.map(new Letters(), 11));
		// Two separate generators
		System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3), 8));
		// A key Generator and a single value
		System.out.println(MapData.map(new CountingGenerator.Character(), "Value", 6));
		// An Iterable and a value Generator
		System.out.println(MapData.map(new Letters(), new RandomGenerator.String(3)));
		// An Iterable and a single value
		System.out.println(MapData.map(new Letters(), "Pop"));
	}
}

/**
 * @Title BasicGeneratorDemo.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicGeneratorDemo
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
	}
}

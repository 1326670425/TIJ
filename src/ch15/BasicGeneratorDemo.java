/**
 * @Title BasicGeneratorDemo.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicGeneratorDemo
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * 
 */
public class BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
	}
}

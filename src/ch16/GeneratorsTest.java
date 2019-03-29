/**
 * @Title GeneratorsTest.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import net.mindview.util.*;
/**
 * @ClassName GeneratorsTest
 * @Description 利用反射测试CountingGenerator
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class GeneratorsTest {
	public static int size = 10;
	public static void test(Class<?> surroudingClass){
		for(Class<?> type : surroudingClass.getClasses()){
			System.out.print(type.getSimpleName() + ": ");
			try{
				Generator<?> g = (Generator<?>)type.newInstance();
				for(int i = 0; i < size; i++)
					System.out.printf(g.next() + " ");
				System.out.println();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) {
		test(CountingGenerator.class);
	}
}

/**
 * @Title Robot.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.util.*;
/**
 * @ClassName Robot
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public interface Robot {
	String name();
	String model();
	List<Operation> operations();
	class Test{
		public static void test(Robot r){
			if(r instanceof Null)
				System.out.println("[Null Robot]");
			System.out.println("Robot name: " + r.name());
			System.out.println("Robot model: " + r.model());
			for(Operation operation : r.operations()){
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}

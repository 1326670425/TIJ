/**
 * @Title RandomTest.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19;
import net.mindview.util.*;

enum Activity{
	SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}

/**
 * @ClassName RandomTest
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * 
 */
public class RandomTest {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++)
			System.out.print(Enums.random(Activity.class) + " ");
	}
}

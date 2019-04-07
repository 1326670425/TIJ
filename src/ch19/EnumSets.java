/**
 * @Title EnumSets.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19;
import java.util.*;
import static ch19.AlarmPoints.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName EnumSets
 * @Description EnumSetʹ��
 * @author �����
 * @date 2019��4��7��
 * 
 */
public class EnumSets {
	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class); // Empty Set
		points.add(BATHROOM);
		print(points);
		points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
		print(points);
		points = EnumSet.allOf(AlarmPoints.class);
		points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
		print(points);
		points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
		print(points);
		points = EnumSet.complementOf(points);
		print(points);
	}
}

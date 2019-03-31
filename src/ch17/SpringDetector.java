/**
 * @Title SpringDetector.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName SpringDetector
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class SpringDetector {
	public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception{
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
		for(int i = 0; i < 10; i++)
			map.put(ghog.newInstance(i), new Prediction());
		print("map = " + map);
		Groundhog gh = ghog.newInstance(3);
		print("Looking up prediction for " + gh);
		if(map.containsKey(gh))
			print(map.get(gh));
		else
			print("Key not found: " + gh);
	}
	public static void main(String[] args) throws Exception{
		detectSpring(Groundhog.class);
	}
}

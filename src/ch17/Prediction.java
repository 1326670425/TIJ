/**
 * @Title Prediction.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import java.util.*;
/**
 * @ClassName Prediction
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class Prediction {
	private static Random rand = new Random(47);
	private boolean shadow = rand.nextDouble() > 0.5;
	public String toString(){
		if(shadow)
			return "Six more weeks of Winter!";
		else
			return "Early Spring!";
	}
}

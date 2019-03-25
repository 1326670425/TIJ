/**
 * @Title WatercolorSets.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;
import ch15.watercolors.*;
import java.util.*;
import static ch15.watercolors.Watercolors.*;
import static ch15.Sets.*;
/**
 * @ClassName WatercolorSets
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class WatercolorSets {
	  public static void main(String[] args) {
		    Set<Watercolors> set1 =
		      EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		    Set<Watercolors> set2 =
		      EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		    System.out.println("set1: " + set1);
		    System.out.println("set2: " + set2);
		    System.out.println("union(set1, set2): " + union(set1, set2));
		    Set<Watercolors> subset = intersection(set1, set2);
		    System.out.println("intersection(set1, set2): " + subset);
		    System.out.println("difference(set1, subset): " +
		      difference(set1, subset));	
		    System.out.println("difference(set2, subset): " +
		      difference(set2, subset));
		    System.out.println("complement(set1, set2): " +
		      complement(set1, set2));
		  }
}

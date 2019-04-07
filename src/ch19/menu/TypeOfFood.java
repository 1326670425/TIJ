/**
 * @Title TypeOfFood.java
 * @Package ch19.menu
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19.menu;
import static ch19.menu.Food.*;
/**
 * @ClassName TypeOfFood
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}
}

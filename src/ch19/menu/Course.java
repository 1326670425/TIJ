/**
 * @Title Course.java
 * @Package ch19.menu
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19.menu;
import net.mindview.util.*;
/**
 * @ClassName Course
 * @Description 枚举的枚举。分类菜单
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public enum Course {
	APPETIZER(Food.Appetizer.class),
	MAINCOURSE(Food.MainCourse.class),
	DESSERT(Food.Dessert.class),
	COFFEE(Food.Coffee.class);
	private Food[] values;
	private Course(Class<? extends Food> kind){
		values = kind.getEnumConstants();
	}
	public Food randomSelection(){
		return Enums.random(values);
	}
}

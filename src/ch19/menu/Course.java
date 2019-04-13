/**
 * @Title Course.java
 * @Package ch19.menu
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19.menu;
import net.mindview.util.*;
/**
 * @ClassName Course
 * @Description ö�ٵ�ö�١�����˵�
 * @author �����
 * @date 2019��4��7��
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

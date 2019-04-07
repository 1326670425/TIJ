/**
 * @Title Meal2.java
 * @Package ch19.menu
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19.menu;
import ch19.menu.Food.MainCourse;
import net.mindview.util.*;
/**
 * @ClassName Meal2
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * 
 */
public enum Meal2 {
	APPETIZER(Food.Appetizer.class),
	MAINCOURSE(Food.MainCourse.class),
	DESSERT(Food.Dessert.class),
	COFFEE(Food.Coffee.class);
	private Food[] values;
	private Meal2(Class<? extends Food> kind){
		values = kind.getEnumConstants();
	}
	public interface Food{
		enum Appetizer implements Food{
			SALAD, SOUP, SPRING_ROLLS
		}
		enum MainCourse implements Food{
			LASAGNE, BURRITO, PAD_THAI,
			LENTILS, HUMMOUS, VINDALOO
		}
		enum Dessert implements Food{
			TIRAMISU, GELATO, BLACK_FOREST_CAKE,
			FRUIT, CREME_CARAMEL
		}
		enum Coffee implements Food{
			BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
			LATTE, CAPPUCCINO, TEA, HERB_TEA
		}
	}
	public Food randomSelection(){
		return Enums.random(values);
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			for(Meal2 meal : Meal2.values()){
				Food food = meal.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}

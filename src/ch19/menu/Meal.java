/**
 * @Title Meal.java
 * @Package ch19.menu
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19.menu;
/**
 * @ClassName Meal
 * @Description 利用枚举中的枚举生成菜单
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public class Meal {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			for(Course course : Course.values()){
				Food food = course.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}

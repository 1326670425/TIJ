/**
 * @Title Meal.java
 * @Package ch19.menu
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19.menu;
/**
 * @ClassName Meal
 * @Description ����ö���е�ö�����ɲ˵�
 * @author �����
 * @date 2019��4��7��
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

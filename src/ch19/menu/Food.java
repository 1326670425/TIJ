/**
 * @Title Food.java
 * @Package ch19.menu
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19.menu;

/**
 * @ClassName Food
 * @Description ʹ�ýӿ�����֯ö��
 * @author �����
 * @date 2019��4��7��
 * 
 */
public interface Food {
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

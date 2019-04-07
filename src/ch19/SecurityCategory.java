/**
 * @Title SecurityCategory.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19;
import net.mindview.util.*;
/**
 * @ClassName SecurityCategory
 * @Description 枚举嵌套
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
enum SecurityCategory {
	STOCK(Security.Stock.class), BOND(Security.Bond.class);
	Security[] values;
	SecurityCategory(Class<? extends Security> kind){
		values = kind.getEnumConstants();
	}
	interface Security{
		enum Stock implements Security{ SHORT, LONG, MARGIN }
		enum Bond implements Security{ MUNICIPAL, JUNK }
	}
	public Security randomSelection(){
		return Enums.random(values);
	}
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			SecurityCategory category = Enums.random(SecurityCategory.class);
			System.out.println(category + ": " + category.randomSelection());
		}
	}
	
}

/**
 * @Title UpcastEnum.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19;

enum Search{ HITHER, YON }

/**
 * @ClassName UpcastEnum
 * @Description 由于values()方法是由编译器插入到enum中的，所以如果将enum实例向上转型为Enum，那么values()就不能使用了。
 * <p>不过，在Class中有个getEnumConstants()方法，可以通过Class对象获得所有enum实例。
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public class UpcastEnum {
	public static void main(String[] args) {
		Search[] vals = Search.values();
		Enum e = Search.HITHER;
		// e.values(); // 没有此方法
		for(Enum en : e.getClass().getEnumConstants())
			System.out.println(en);
	}
}

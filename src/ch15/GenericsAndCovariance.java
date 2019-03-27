/**
 * @Title GenericsAndCovariance.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericsAndCovariance
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class GenericsAndCovariance {
	public static void main(String[] args) {
		// 通配符允许协变类型
		List<? extends Fruit> flist = new ArrayList<Apple>();
		// 编译错误 can't add any type of object
		// flist.add(new Apple());
		// flist.add(new Fruit());
		// flist.add(new Object());
		flist.add(null);
		Fruit f = flist.get(0);
	}
}

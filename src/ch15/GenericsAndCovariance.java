/**
 * @Title GenericsAndCovariance.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * @version 1.0
 */
package ch15;
import java.util.*;
/**
 * @ClassName GenericsAndCovariance
 * @Description TODO
 * @author �����
 * @date 2019��3��27��
 * 
 */
public class GenericsAndCovariance {
	public static void main(String[] args) {
		// ͨ�������Э������
		List<? extends Fruit> flist = new ArrayList<Apple>();
		// ������� can't add any type of object
		// flist.add(new Apple());
		// flist.add(new Fruit());
		// flist.add(new Object());
		flist.add(null);
		Fruit f = flist.get(0);
	}
}

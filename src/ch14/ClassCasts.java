/**
 * @Title ClassCasts.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * @version 1.0
 */
package ch14;

class Building{}
class House extends Building{}

/**
 * @ClassName ClassCasts
 * @Description TODO
 * @author �����
 * @date 2019��2��24��
 * 
 */
public class ClassCasts {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;
	}
}

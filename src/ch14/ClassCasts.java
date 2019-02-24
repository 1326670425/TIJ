/**
 * @Title ClassCasts.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;

class Building{}
class House extends Building{}

/**
 * @ClassName ClassCasts
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
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

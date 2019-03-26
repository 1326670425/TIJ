/**
 * @Title LostInformation.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;
import java.util.*;

class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION, MOMENTUM>{}

/**
 * @ClassName LostInformation
 * @Description 在泛型代码内部，无法获得任何有关泛型参数类型的信息
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
	}
}

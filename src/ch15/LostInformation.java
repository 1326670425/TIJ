/**
 * @Title LostInformation.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
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
 * @Description �ڷ��ʹ����ڲ����޷�����κ��йط��Ͳ������͵���Ϣ
 * @author �����
 * @date 2019��3��26��
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

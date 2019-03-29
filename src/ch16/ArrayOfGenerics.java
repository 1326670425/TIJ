/**
 * @Title ArrayOfGenerics.java
 * @Package ch16
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月29日
 * @version 1.0
 */
package ch16;
import java.util.*;
/**
 * @ClassName ArrayOfGenerics
 * @Description 编译器不让实例化泛型数组，但是可以创建这种数组的引用。可以创建非泛型数组，然后将其转型
 * @author 吴扬颉
 * @date 2019年3月29日
 * 
 */
public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la; // "Unchecked" warning
		ls[0] = new ArrayList<String>();
		// 编译期错误
		// ls[1] = new ArrayList<Integer>();
		
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();
		
		//
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < spheres.length; i++)
			spheres[i] = new ArrayList<BerylliumSphere>();
		
	}
}

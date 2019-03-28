/**
 * @Title CRGWithBasicHolder.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class Subtype extends BasicHolder<Subtype>{}

/**
 * @ClassName CRGWithBasicHolder
 * @Description 古怪的循环泛型(CRG):基类用导出类代替其参数，这意味着泛型基类变成了一种其所有导出类的公共功能的模板，但是这些功能对于其所有参数和返回值，
 * 将使用导出类型。也就是说，在所产生的类中将使用确切类型而不是基类型
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class CRGWithBasicHolder {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
	}
}

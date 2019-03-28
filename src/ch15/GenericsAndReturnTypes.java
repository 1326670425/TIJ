/**
 * @Title GenericsAndReturnTypes.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

interface GenericGetter<T extends GenericGetter<T>>{
	T get();
}

interface Getter extends GenericGetter<Getter>{}

/**
 * @ClassName GenericsAndReturnTypes
 * @Description 自限定泛型事实上将产生确切的导出类型作为其返回值
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class GenericsAndReturnTypes {
	void test(Getter g){
		Getter result = g.get();
		GenericGetter gg = g.get();
	}
}

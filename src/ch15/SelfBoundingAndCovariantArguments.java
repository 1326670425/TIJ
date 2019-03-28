/**
 * @Title SelfBoundingAndCovariantArguments.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
	void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter>{
	
}


/**
 * @ClassName SelfBoundingAndCovariantArguments
 * @Description 在使用自限定类型时，在导出类中只有一个方法，并且这个方法接受导出类型而不是基类型
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1, Setter s2, SelfBoundSetter sbs){
		s1.set(s2);
		// s1.set(sbs);// Error: set(Setter) in SelfBoundSetter<Setter> can't be applied to (SelfBoundSetter)
	}
}

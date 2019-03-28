/**
 * @Title HijackedInterface.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName HijackedInterface
 * @Description 基类劫持了接口：按理说一个Cat对象应该只能与其他Cat对象比较。
 * <p>但是，一旦为Comparable确定了ComparablePet参数，那么其他任何实现类都不能与ComparablePet之外的任何对象比较
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
/*
class Cat extends ComparablePet implements Comparable<Cat>{
	// Error: Comparable 不能被两个不同的参数实现
	public int compareTo(Cat arg){ return 0; }
}
*/
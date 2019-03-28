/**
 * @Title RestricedComparablePets.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName RestricedComparablePets
 * @Description Hamster说明再次实现ComparablePet中的相同接口是可能的，只要他们精确相同，包括参数类型在内
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
class Hamster extends ComparablePet implements Comparable<ComparablePet>{
	public int compareTo(ComparablePet arg){ return 0; }
}

class Gecko extends ComparablePet{
	public int compareTo(ComparablePet arg){ return 0; }
}
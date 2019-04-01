/**
 * @Title Groundhog2.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;

/**
 * @ClassName Groundhog2
 * @Description Object.equals()比较对象的地址。如果要使用自己的类作为HashMap的键，就要同时重载equals()方法和hashCode()方法
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class Groundhog2 extends Groundhog{
	public Groundhog2(int n){ super(n); }
	public int hashCode(){ return number; }
	public boolean equals(Object o){
		// 顺带检查了o是不是null，因为如果instanceof左边是null，将会返回false
		return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
	}
}

/**
 * @Title BasicBounds.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月26日
 * @version 1.0
 */
package ch15;

interface HasColor{ java.awt.Color getColor(); }

class Colored<T extends HasColor>{
	T item;
	Colored(T item){ this.item = item; }
	T getItem(){ return item; }
	// 由于边界的存在，所以允许调用该方法
	java.awt.Color color(){ return item.getColor(); }
}

class Dimension{ public int x, y, z; }
// 类必须在前边，然后是接口
// class ColoredDimension<T extends HasColor & Dimension>{
class ColoredDimension<T extends Dimension & HasColor>{
	T item;
	ColoredDimension(T item){ this.item = item; }
	T getItem(){ return item; }
	java.awt.Color color(){ return item.getColor(); }
	int getX(){ return item.x; }
	int getY(){ return item.y; }
	int getZ(){ return item.z; }
}

interface Weight{ int weight(); }

// 和Java的继承机制一样，只能有一个具体类，但可以有多个接口
class Solid<T extends Dimension & HasColor & Weight>{
	T item;
	Solid(T item){ this.item = item; }
	T getItem(){ return item; }
	java.awt.Color color(){ return item.getColor(); }
	int getX(){ return item.x; }
	int getY(){ return item.y; }
	int getZ(){ return item.z; }
	int weight(){ return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight{
	public java.awt.Color getColor(){ return null; }
	public int weight(){ return 0; }
}

/**
 * @ClassName BasicBounds
 * @Description 泛型边界
 * @author 吴扬颉
 * @date 2019年3月26日
 * 
 */
public class BasicBounds {
	public static void main(String[] args) {
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}
}

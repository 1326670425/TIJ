/**
 * @Title BasicBounds.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��26��
 * @version 1.0
 */
package ch15;

interface HasColor{ java.awt.Color getColor(); }

class Colored<T extends HasColor>{
	T item;
	Colored(T item){ this.item = item; }
	T getItem(){ return item; }
	// ���ڱ߽�Ĵ��ڣ�����������ø÷���
	java.awt.Color color(){ return item.getColor(); }
}

class Dimension{ public int x, y, z; }
// �������ǰ�ߣ�Ȼ���ǽӿ�
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

// ��Java�ļ̳л���һ����ֻ����һ�������࣬�������ж���ӿ�
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
 * @Description ���ͱ߽�
 * @author �����
 * @date 2019��3��26��
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

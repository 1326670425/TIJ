/**
 * @Title Shapes.java
 * @Package ch14
 * @Description TODO
 * @author �����
 * @date 2019��2��6��
 * @version 1.0
 */
package ch14;
import java.util.*;
/**
 * @ClassName Shapes
 * @Description TODO
 * @author �����
 * @date 2019��2��6��
 * 
 */
abstract class Shape {
	void draw(){
		System.out.println(this + ".draw()");
	}
	abstract public String toString();
}

class Circle extends Shape{
	public String toString(){ return "Circle"; }
}

class Square extends Shape{
	public String toString(){ return "Square"; }
}
class Triangle extends Shape{
	public String toString(){ return "Tirangle"; }
}

public class Shapes{
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for (Shape shape : shapeList) {
			shape.draw();
		}
	}
}
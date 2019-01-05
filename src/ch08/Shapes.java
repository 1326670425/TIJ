/**
 * @Title Shapes.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月4日
 * @version 1.0
 */
package ch08;

import java.util.Random;

class Shape{
	public void draw(){}
	public void erase(){}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Circle.draw()");
	}
	public void erase(){
		System.out.println("Circle.erase()");
	}
}
class Triangle extends Shape{
	public void draw(){
		System.out.println("Triangle.draw()");
	}
	public void erase(){
		System.out.println("Triangle.erase()");
	}
}
class Square extends Shape{
	public void draw(){
		System.out.println("Square.draw()");
	}
	public void erase(){
		System.out.println("Square.erase()");
	}
}
class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next(){
		switch(rand.nextInt(3)){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}
/**
 * @ClassName Shapes
 * @Description 多态，工厂
 * @author 吴扬颉
 * @date 2019年1月4日
 * 
 */
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args){
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		for(Shape shp : s)
			shp.draw();
	}
}

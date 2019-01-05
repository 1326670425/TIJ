/**
 * @Title CADSystem.java
 * @Package ch07
 * @Description 确保正确清理
 * @author 吴扬颉
 * @date 2019年1月4日
 * @version 1.0
 */
package ch07;
class Shape{
	Shape(){
		System.out.println("基类无参构造方法");
	}
	Shape(int i){
		System.out.println("Shape constructor");
	}
	void dispose(){
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing Circle");
	}
	void dispose(){
		System.out.println("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing Triangle");
	}
	void dispose(){
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	private int start,end;
	Line(int start,int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line: "+ start + "," +end);
	}
	void dispose(){
		System.out.println("Erasing Line: "+ start + "," +end);
		super.dispose();
	}
}
/**
 * @ClassName CADSystem
 * @Description 确保正确清理
 * @author 吴扬颉
 * @date 2019年1月4日
 * 
 */
public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public CADSystem(int i){
		super(i);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j*j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}
	public void dispose(){
		System.out.println("CADSystem.dispose()");
		t.dispose();
		c.dispose();
		for (int i = lines.length - 1; i >= 0; i--) {
			lines[i].dispose();
		}
		super.dispose();
	}
	public static void main(String[] args){
		CADSystem x = new CADSystem(1);
		try{
			//
		}finally{
			x.dispose();
		}
	}
}

/**
 * @Title Burrito.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * @version 1.0
 */
package ch19;
import static ch19.Spiciness.*;
/**
 * @ClassName Burrito
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * 
 */
public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree){ this.degree = degree; }
	public String toString(){ return "Burrito is " + degree; }
	public static void main(String[] args) {
		System.out.println(new Burrito(NOT));
		System.out.println(new Burrito(MEDIUM));
		System.out.println(new Burrito(HOT));
	}
}

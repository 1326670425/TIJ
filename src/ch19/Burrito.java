/**
 * @Title Burrito.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * @version 1.0
 */
package ch19;
import static ch19.Spiciness.*;
/**
 * @ClassName Burrito
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
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

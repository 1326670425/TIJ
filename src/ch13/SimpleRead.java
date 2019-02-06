/**
 * @Title SimpleRead.java
 * @Package ch13
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月6日
 * @version 1.0
 */
package ch13;
import java.io.*;
/**
 * @ClassName SimpleRead
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月6日
 * 
 */
public class SimpleRead {
	//StringReader将String转化为可读的流对象，然后用这个对象来构造BufferedReader对象
	public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 3.1415"));
	public static void main(String[] args) {
		try{
			System.out.println("What is your name?");
			String name = input.readLine();
			System.out.println(name);
			System.out.println("How old are you? What is your favorite double?");
			System.out.println("(input: <age> <double>)");
			String numbers = input.readLine();
			System.out.println(numbers);
			String[] numArray = numbers.split(" ");
			int age = Integer.parseInt(numArray[0]);
			double favorite = Double.parseDouble(numArray[1]);
			System.out.format("Hi %s.\n", name);
			System.out.format("In 5 years you will be %d.\n", age + 5);
			System.out.format("My favorite double is %f.", favorite / 2);
		}catch(IOException e){
			System.err.println("I/O exception");
		}
	}
}

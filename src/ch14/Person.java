/**
 * @Title Person.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;

interface Null{}
/**
 * @ClassName Person
 * @Description 空对象
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class Person {
	public final String first;
	public final String last;
	public final String address;
	public Person(String first, String last, String address){
		this.first = first;
		this.last = last;
		this.address = address;
	}
	public String toString(){
		return "Person: " + first + " " + last + " " + address;
	}
	public static class NullPerson extends Person implements Null{
		private NullPerson(){ super("None", "None", "None"); }
		public String toString(){ return "NullPerson"; }
	}
	public static final Person NULL = new NullPerson();
}

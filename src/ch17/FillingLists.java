/**
 * @Title FillingLists.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * @version 1.0
 */
package ch17;
import java.util.*;

class StringAddress{
	private String s;
	public StringAddress(String s){ this.s = s; }
	public String toString(){
		return super.toString() + " " + s;
	}
}

/**
 * @ClassName FillingLists
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月30日
 * 
 */
public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello"))
				);
		System.out.println(list);
		Collections.fill(list, new StringAddress("World"));
		System.out.println(list);
	}
}

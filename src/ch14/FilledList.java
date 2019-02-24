/**
 * @Title FilledList.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * @version 1.0
 */
package ch14;
import java.util.*;

class CountedInteger{
	private static long counter;
	private final long id = counter++;
	public String toString(){ return Long.toString(id); }
}

/**
 * @ClassName FilledList
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年2月24日
 * 
 */
public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type){ this.type = type; }
	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		try{
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
}

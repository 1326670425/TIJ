/**
 * @Title CountedString.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月31日
 * @version 1.0
 */
package ch17;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName CountedString
 * @Description 创建一个良好的hashCode()
 * <p>(1)给int变量result赋予某个非零常量
 * <p>(2)为对象内每个有意义的域f，计算一个int散列码c
 * <p>(3)合并计算得到的散列码：result=37*result+c
 * <p>(4)返回result
 * <p>(5)检查hashCode()生成的结果，确保相同的对象有相同的散列码
 * @author 吴扬颉
 * @date 2019年3月31日
 * 
 */
public class CountedString {
	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;
	public CountedString(String str){
		s = str;
		created.add(s);
		// id is the total number of instances of this string in use by CountedString
		for(String s2 : created)
			if(s2.equals(s))
				id++;
	}
	public String toString(){
		return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
	}
	public int hashCode(){
		// The very simple approach:
		// return s.hashCode() * id;
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + id;
		return result;
	}
	public boolean equals(Object o){
		return o instanceof CountedString && s.equals(((CountedString)o).s) && id == ((CountedString)o).id;
	}
	public static void main(String[] args) {
		Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
		CountedString[] cs = new CountedString[5];
		for(int i = 0; i < cs.length; i++){
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		print(map);
		for(CountedString csstring : cs){
			print("Looking up " + csstring);
			print(map.get(csstring));
		}
	}
}

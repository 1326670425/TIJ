/**
 * @Title CountedString.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName CountedString
 * @Description ����һ�����õ�hashCode()
 * <p>(1)��int����result����ĳ�����㳣��
 * <p>(2)Ϊ������ÿ�����������f������һ��intɢ����c
 * <p>(3)�ϲ�����õ���ɢ���룺result=37*result+c
 * <p>(4)����result
 * <p>(5)���hashCode()���ɵĽ����ȷ����ͬ�Ķ�������ͬ��ɢ����
 * @author �����
 * @date 2019��3��31��
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

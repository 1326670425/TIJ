/**
 * @Title AvaliableCharSets.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��2��
 * @version 1.0
 */
package ch18;
import java.nio.charset.*;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName AvaliableCharSets
 * @Description Charset�ࣺ���빤��
 * @author �����
 * @date 2019��4��2��
 * 
 */
public class AvaliableCharSets {
	public static void main(String[] args) {
		SortedMap<String, Charset> charSets = Charset.availableCharsets();
		Iterator<String> it = charSets.keySet().iterator();
		while(it.hasNext()){
			String csName = it.next();
			printnb(csName);
			Iterator aliases = charSets.get(csName).aliases().iterator();
			if(aliases.hasNext())
				printnb(": ");
			while(aliases.hasNext()){
				printnb(aliases.next());
				if(aliases.hasNext())
					printnb(", ");
			}
			print();
		}
	}
}

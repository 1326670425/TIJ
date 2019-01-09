/**
 * @Title AsListInference.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;

import java.util.*;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

/**
 * @ClassName AsListInference
 * @Description Arrays.asList()方法的限制是它对所产生的List的类型做出了最理想的假设，而并没有注意你对它会赋予什么样的类型。
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(
				new Crusty(), new Slush(), new Powder());
		// 无法编译
		// List<Snow> snow2 = Arrays.asList(
		//		new Light(), new Heavy());
		// 编译器会提示：
		// found:java.util.List<Powder>
		// required:java.util.List<Snow>
		
		// Collections.addAll() doesn't get confused
		// Collections.addAll()不会有这种困惑，因为它从第一个参数中了解到了目标类型
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// Give a hint using an explicit type argument specification
		List<Snow> snow4 = Arrays.<Snow>asList(
				new Light(), new Heavy());
	}
}

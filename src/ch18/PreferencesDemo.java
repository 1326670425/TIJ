/**
 * @Title PreferencesDemo.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package ch18;
import java.util.prefs.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName PreferencesDemo
 * @Description Preferences与对象序列化相比，前者与对象持久性更密切，因为它可以自动存储和读取信息，不过它只能用于小的，受限的数据集合。
 * <p>Preferences API用于存储和读取用户的偏好以及程序配置项的设置
 * @author 吴扬颉
 * @date 2019年4月3日
 * 
 */
public class PreferencesDemo {
	public static void main(String[] args) throws Exception{
		Preferences prefs = Preferences.userNodeForPackage(Preferences.class);
		prefs.put("Location", "Oz");
		prefs.put("Footwear", "Ruby Slippers");
		prefs.putInt("Companions", 4);
		prefs.putBoolean("Are there witches?", true);
		int usageCount = prefs.getInt("UsageCount", 0);
		usageCount++;
		prefs.putInt("UsageCount", usageCount);
		for(String key : prefs.keys())
			print(key + ": " + prefs.get(key, null));
		// 必须提供默认的value
		print("How many companions does Dorothy hava? " + prefs.getInt("Companions", 0));
	}
}

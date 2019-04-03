/**
 * @Title PreferencesDemo.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * @version 1.0
 */
package ch18;
import java.util.prefs.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName PreferencesDemo
 * @Description Preferences��������л���ȣ�ǰ�������־��Ը����У���Ϊ�������Զ��洢�Ͷ�ȡ��Ϣ��������ֻ������С�ģ����޵����ݼ��ϡ�
 * <p>Preferences API���ڴ洢�Ͷ�ȡ�û���ƫ���Լ����������������
 * @author �����
 * @date 2019��4��3��
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
		// �����ṩĬ�ϵ�value
		print("How many companions does Dorothy hava? " + prefs.getInt("Companions", 0));
	}
}

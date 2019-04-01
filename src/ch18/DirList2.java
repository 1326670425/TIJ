/**
 * @Title DirList2.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch18;
import java.util.regex.*;
import java.io.*;
import java.util.*;
/**
 * @ClassName DirList2
 * @Description Ŀ¼�б����������ڲ��ࣩ
 * @author �����
 * @date 2019��4��1��
 * 
 */
public class DirList2 {
	public static FilenameFilter filter(final String regex){
		return new FilenameFilter(){
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir, String name){
				return pattern.matcher(name).matches();
			}
		};
	}
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(filter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}

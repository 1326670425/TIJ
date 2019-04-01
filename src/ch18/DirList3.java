/**
 * @Title DirList3.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch18;
import java.util.regex.*;
import java.io.*;
import java.util.*;
/**
 * @ClassName DirList3
 * @Description 目录列表器（方法内的匿名内部类）
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class DirList3 {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new FilenameFilter(){
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir, String name){
					return pattern.matcher(name).matches();
				}
			});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}

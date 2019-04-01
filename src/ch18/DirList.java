/**
 * @Title DirList.java
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
 * @ClassName DirList
 * @Description 目录列表器
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class DirList {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex){
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name){
		return pattern.matcher(name).matches();
	}
}
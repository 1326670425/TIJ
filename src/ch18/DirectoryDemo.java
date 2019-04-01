/**
 * @Title DirectoryDemo.java
 * @Package ch18
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch18;
import java.io.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

/**
 * @ClassName DirectoryDemo
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * 
 */
public class DirectoryDemo {
	public static void main(String[] args) {
		// All directories
		PPrint.pprint(Directory.walk(".").dirs);
		// All files beginning with 'T'
		for(File file : Directory.local(".", "T.*"))
			print(file);
		print("-------------------------");
		// All Java files beginning with 'T'
		for(File file : Directory.walk(".", "T.*\\.java"))
			print(file);
		print("=========================");
		// Class Files containing "Z" or "z"
		for(File file : Directory.walk(".", ".*[Zz].*\\.class"))
			print(file);
		
	}
}

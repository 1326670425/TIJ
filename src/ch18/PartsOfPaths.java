/**
 * @Title PartsOfPaths.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月6日
 * @version 1.0
 */
package ch18;

import java.nio.file.*;

/**
 * @ClassName PartsOfPaths
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月6日
 * 
 */
public class PartsOfPaths {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("PartsOfPaths.java").toAbsolutePath();
        for(int i = 0; i < p.getNameCount(); i++)
            System.out.println(p.getName(i));
        System.out.println("ends with '.java': " +
        p.endsWith(".java"));
        for(Path pp : p) {
            System.out.print(pp + ": ");
            System.out.print(p.startsWith(pp) + " : ");
            System.out.println(p.endsWith(pp));
        }
        System.out.println("Starts with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }
}

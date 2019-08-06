/**
 * @Title TryWithResources.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月2日
 * @version 1.0
 */
package ch12;
import java.io.*;

/**
 * @ClassName TryWithResources
 * @Description Java 7 引入的 try-with-resources 语法
 * @author 吴扬颉
 * @date 2019年8月2日
 * 
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(
                InputStream in = new FileInputStream(
                        new File("TryWithResources.java"))
        ) {
            int contents = in.read();
            // Process contents
        } catch(IOException e) {
            // Handle the error
        }
    }
}

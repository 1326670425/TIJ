/**
 * @Title TryWithResources.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��8��2��
 * @version 1.0
 */
package ch12;
import java.io.*;

/**
 * @ClassName TryWithResources
 * @Description Java 7 ����� try-with-resources �﷨
 * @author �����
 * @date 2019��8��2��
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

/**
 * @Title StreamsAreAutoCloseable.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月2日
 * @version 1.0
 */
package ch12;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName StreamsAreAutoCloseable
 * @Description 在try-with-resources 定义子句中创建的对象都必须实现 java.langAutocloseable 接口，
 * 这个接口有一个方法 close()。
 * <br><br>
 * 资源规范头中可以包含多个定义，并且通过分号分割，最后一个分号可选，每个定义都会在try语句结束后调用close()方法。
 * @author 吴扬颉
 * @date 2019年8月2日
 * 
 */
public class StreamsAreAutoCloseable {
    public static void
    main(String[] args) throws IOException{
        try(
                Stream<String> in = Files.lines(
                        Paths.get("StreamsAreAutoCloseable.java"));
                PrintWriter outfile = new PrintWriter(
                        "Results.txt"); // [1]
        ) {
            in.skip(5)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEachOrdered(outfile::println);
        } // [2]
    }
}

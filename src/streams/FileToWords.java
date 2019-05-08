/**
 * @Title FileToWords.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;

/**
 * @ClassName FileToWords
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class FileToWords {
	  public static Stream<String> stream(String filePath)
			  throws Exception {
			    return Files.lines(Paths.get(filePath))
			      .skip(1) // First (comment) line
			      .flatMap(line ->
			        Pattern.compile("\\W+").splitAsStream(line));
			    }
}

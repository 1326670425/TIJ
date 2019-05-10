/**
 * @Title Peeking.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

/**
 * @ClassName Peeking
 * @Description peek()操作的目的是帮助调试，允许无修改的查看流中的元素
 * @author 吴扬颉
 * @date 2019年5月4日
 * 
 */
public class Peeking {
	public static void main(String[] args) throws Exception{
		FileToWords.stream("src/streams/Cheese.dat")
			.skip(21)
			.limit(4)
			.map(w -> w + " ")
			.peek(System.out::print)
			.map(String::toUpperCase)
			.peek(System.out::print)
			.map(String::toLowerCase)
			.forEach(System.out::print);
	}
}

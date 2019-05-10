/**
 * @Title Peeking.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

/**
 * @ClassName Peeking
 * @Description peek()������Ŀ���ǰ������ԣ��������޸ĵĲ鿴���е�Ԫ��
 * @author �����
 * @date 2019��5��4��
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

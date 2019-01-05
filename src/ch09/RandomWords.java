/**
 * @Title RandomWords.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch09;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName RandomWords
 * @Description 实现Readable接口
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class RandomWords implements Readable{
	private static Random rand = new Random(47);
	private static final char[] capitals = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = 
			"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowles =
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count){ this.count = count; }
	public int read(CharBuffer cb){
		if(count-- == 0)
			return -1;//结束输入
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowles[rand.nextInt(vowles.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(10));
		while(s.hasNext()){
			System.out.println(s.next());
		}
		s.close();
	}
}

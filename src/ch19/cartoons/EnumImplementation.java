/**
 * @Title EnumImplementation.java
 * @Package ch19.cartoons
 * @Description TODO
 * @author �����
 * @date 2019��4��7��
 * @version 1.0
 */
package ch19.cartoons;
import java.util.*;
import net.mindview.util.*;

enum CartoonCharacter implements Generator<CartoonCharacter>{
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private Random rand = new Random(47);
	public CartoonCharacter next(){
		return values()[rand.nextInt(values().length)];
	}
}

/**
 * @ClassName EnumImplementation
 * @Description enum��ʵ�ֽӿ�
 * @author �����
 * @date 2019��4��7��
 * 
 */
public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg){
		System.out.print(rg.next() + ", ");
	}
	public static void main(String[] args) {
		CartoonCharacter cc = CartoonCharacter.BOB;
		for(int i = 0; i < 10; i++)
			printNext(cc);
	}
}

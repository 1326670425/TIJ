/**
 * @Title CreatingOptionals.java
 * @Package streams
 * @Description TODO
 * @author �����
 * @date 2019��5��4��
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName CreatingOptionals
 * @Description ����Optional
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class CreatingOptionals {
	static void test(String testName, Optional<String> opt) {
		System.out.println(" === " + testName + " === ");
		System.out.println(opt.orElse("Null"));
	}
	public static void main(String[] args) {
		test("empty", Optional.empty());
		test("of", Optional.of("Howdy"));
		try {
			// ��ͼ��null����Optional��������׳��쳣
			test("of", Optional.of(null));
		} catch(Exception e) {
			System.out.println(e);
		}
		// ofNullable(value)����ȷ���Ƿ�Ϊ�գ�Ϊ��ʱ�Զ�����Optional.empty
		// ����ֵ��װ��Optional��
		test("ofNullable", Optional.ofNullable("Hi"));
		// ofNullable()��ܺõش���null
		test("ofNullable", Optional.ofNullable(null));
	}
}

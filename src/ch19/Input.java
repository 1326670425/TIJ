/**
 * @Title Input.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import java.util.*;
/**
 * @ClassName Input
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public enum Input {
	NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
	TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
	ABORT_TRANSACTION{
		public int amount(){
			throw new RuntimeException("ABORT.amount()");
		}
	},
	STOP{// this must be the last instance
		public int amount(){
			throw new RuntimeException("SHUT_DOWN.amount()");
		}
	};
	int value;
	Input(int value){ this.value = value; }
	Input(){}
	int amount(){ return value; }
	static Random rand = new Random(47);
	public static Input randomSelection(){
		// 不包括STOP
		return values()[rand.nextInt(values().length - 1)];
	}
}

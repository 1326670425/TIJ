/**
 * @Title Signal.java
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
 * @ClassName Signal
 * @Description Optional��
 * @author �����
 * @date 2019��5��4��
 * 
 */
public class Signal {
	private final String msg;
	public Signal(String msg) { this.msg = msg; }
	public String getMsg() { return msg; }
	@Override
	public String toString() {
		return "Signal(" + msg + ")";
	}
	static Random rand = new Random(47);
	public static Signal morse() {
		switch(rand.nextInt(4)) {
		case 1:
			return new Signal("dot");
		case 2:
			return new Signal("dash");
		default:
			return null;
		}
	}
	public static Stream<Optional<Signal>> stream() {
		return Stream.generate(Signal::morse)
				.map(signal -> Optional.ofNullable(signal));
	}
}
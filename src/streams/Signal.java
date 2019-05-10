/**
 * @Title Signal.java
 * @Package streams
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年5月4日
 * @version 1.0
 */
package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * @ClassName Signal
 * @Description Optional流
 * @author 吴扬颉
 * @date 2019年5月4日
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

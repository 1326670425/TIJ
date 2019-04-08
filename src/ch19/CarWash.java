/**
 * @Title CarWash.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * @ClassName CarWash
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class CarWash {
	public enum Cycle{
	    UNDERBODY {
	        void action() { print("Spraying the underbody"); }
	      },
	      WHEELWASH {
	        void action() { print("Washing the wheels"); }
	      },
	      PREWASH {
	        void action() { print("Loosening the dirt"); }
	      },
	      BASIC {
	        void action() { print("The basic wash"); }
	      },
	      HOTWAX {
	        void action() { print("Applying hot wax"); }
	      },
	      RINSE {
	        void action() { print("Rinsing"); }
	      },
	      BLOWDRY {
	        void action() { print("Blowing dry"); }
	      };
	      abstract void action();
	}
	EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.RINSE);
	public void add(Cycle cycle){ cycles.add(cycle); }
	public void washCar(){
		for(Cycle c : cycles)
			c.action();
	}
	public String toString(){ return cycles.toString(); }
	public static void main(String[] args) {
		CarWash wash = new CarWash();
		print(wash);
		wash.washCar();
		// 添加顺序并不重要，因为输出次序取决于enum实例定义的次序
		wash.add(Cycle.BLOWDRY);
		wash.add(Cycle.BLOWDRY);
		wash.add(Cycle.RINSE);
		wash.add(Cycle.HOTWAX);
		print(wash);
		wash.washCar();
	}
}

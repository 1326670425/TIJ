/**
 * @Title EnumMaps.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import java.util.*;
import static ch19.AlarmPoints.*;
import static net.mindview.util.Print.*;

interface Command{ void action(); }

/**
 * @ClassName EnumMaps
 * @Description 命令模式
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class EnumMaps {
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
		em.put(KITCHEN, new Command(){
			public void action(){ print("Kitchen fire!"); }
		});
		em.put(BATHROOM, new Command(){
			public void action(){ print("Bathroom alert!"); }
		});
		for(Map.Entry<AlarmPoints, Command> e : em.entrySet()){
			printnb(e.getKey() + ": ");
			e.getValue().action();
		}
		try{
			em.get(UTILITY).action();
		}catch(Exception e){
			print(e);
		}
	}
}

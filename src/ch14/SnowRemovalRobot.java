/**
 * @Title SnowRemovalRobot.java
 * @Package ch14
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14;
import java.util.*;
/**
 * @ClassName SnowRemovalRobot
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public class SnowRemovalRobot implements Robot{
	private String name;
	public SnowRemovalRobot(String name){ this.name = name; }
	public String name(){ return name; }
	public String model(){ return "SnowBot series 11"; }
	public List<Operation> operations(){
		return Arrays.asList(
				new Operation(){
					public String description(){
						return name + " can shovel snow";
					}
					public void command(){
						System.out.println(name + "shoveling snow");
					}
				},
				new Operation(){
					public String description(){
						return name + " can chip ice";
					}
					public void command(){
						System.out.println(name + "chipping ice");
					}
				},
				new Operation(){
					public String description(){
						return name + " can clear the roof";
					}
					public void command(){
						System.out.println(name + "clearing roof");
					}
				}
				);
	}
	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}
}

/**
 * @Title OzWitch.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;
/**
 * @ClassName OzWitch
 * @Description 除了不能继承自enum之外，基本可以将enum看做一个常规类，可以向其中添加方法
 * <p>本例返回对枚举实例自身的描述
 * @author 吴扬颉
 * @date 2019年4月4日
 * 
 */
public enum OzWitch {
	// 必须先定义enum实例，方法在其后边
	WEST("Miss Gulch, aka the Wicked Witch of the West"),
	NORTH("Glinda, the Good Witch of the North"),
	EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"),
	// 如果要定义自己的方法，enum实例的最后添加分号
	
	SOUTH("Good by inferencem but missing");
	private String description;
	private OzWitch(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public static void main(String[] args) {
		for(OzWitch witch : OzWitch.values())
			print(witch + ": " + witch.getDescription());
	}
}

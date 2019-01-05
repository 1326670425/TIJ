/**
 * @Title Transmogrify.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch08;

class Actor{
	public void act(){}
}
class HappyActor extends Actor{
	public void act(){ System.out.println("HappyActor"); }
}
class SadActor extends Actor{
	public void act(){ System.out.println("SadActor"); }
}
class Stage{
	private Actor actor = new HappyActor();
	public void change(){ actor = new SadActor(); }
	public void performPlay(){ actor.act(); }
}
/**
 * @ClassName Transmogrify
 * @Description 状态模式
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}

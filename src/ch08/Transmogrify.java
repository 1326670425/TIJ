/**
 * @Title Transmogrify.java
 * @Package ch08
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
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
 * @Description ״̬ģʽ
 * @author �����
 * @date 2019��1��5��
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

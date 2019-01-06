/**
 * @Title Adventure.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch09;

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter{
	public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim{
	public void swim(){}
	public void fly(){}
}
/**
 * @ClassName Adventure
 * @Description ���ؼ̳У���ӿڣ�
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class Adventure {
	public static void t(CanFight x){ x.fight(); }
	public static void u(CanSwim x){ x.swim(); }
	public static void v(CanFly x){ x.fly(); }
	public static void w(ActionCharacter x){ x.fight(); }
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
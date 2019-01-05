/**
 * @Title HorrorShow.java
 * @Package ch09
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch09;

interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destroy();
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	public void menace(){}
	public void destroy(){}
}
interface Vampire extends DangerousMonster,Lethal{
	void drinkBlood();
}
class VeryBadVampire implements Vampire{
	public void menace(){}
	public void destroy(){}
	public void kill(){}
	public void drinkBlood(){}
}


/**
 * @ClassName HorrorShow
 * @Description ͨ���̳���չ�ӿ�
 * @author �����
 * @date 2019��1��5��
 * 
 */
//��Ͻӿ�ʱ��������ͻ����ǩ���򷵻����Ͳ�ͬ���ڴ�����ϵĲ�ͬ�ӿ���ʹ����ͬ�ķ�����ͨ������ɴ���Ŀɶ��ԵĻ��ң�Ӧ���������������
public class HorrorShow {
	static void u(Monster b){ b.menace(); }
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
	}
	static void w(Lethal l){ l.kill(); }
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}

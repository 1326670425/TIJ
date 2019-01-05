/**
 * @Title HorrorShow.java
 * @Package ch09
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
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
 * @Description 通过继承扩展接口
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
//组合接口时的命名冲突——签名或返回类型不同。在打算组合的不同接口中使用相同的方法名通常会造成代码的可读性的混乱，应尽量避免这种情况
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

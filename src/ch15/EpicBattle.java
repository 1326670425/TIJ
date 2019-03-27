/**
 * @Title EpicBattle.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月27日
 * @version 1.0
 */
package ch15;
import java.util.*;

interface SuperPower{}
interface XRayVision extends SuperPower{
	void seeThroughWalls();
}
interface SuperHearing extends SuperPower{
	void hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
	void trackBySmell();
}

class SuperHero<POWER extends SuperPower>{
	POWER power;
	SuperHero(POWER power){ this.power = power; }
	POWER getPower(){ return power; }
}
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{
	SuperSleuth(POWER power){ super(power); }
	void see(){ power.seeThroughWalls(); }
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
	CanineHero(POWER power){ super(power); }
	void hear(){ power.hearSubtleNoises(); }
	void smell(){ power.trackBySmell(); }
}

class SuperHearSmell implements SuperHearing, SuperSmell{
	public void hearSubtleNoises(){}
	public void trackBySmell(){}
}

class DogBoy extends CanineHero<SuperHearSmell>{
	DogBoy(){ super(new SuperHearSmell()); }
}

/**
 * @ClassName EpicBattle
 * @Description 泛型边界
 * @author 吴扬颉
 * @date 2019年3月27日
 * 
 */
public class EpicBattle {
	static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
		hero.getPower().hearSubtleNoises();
	}
	static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
		hero.getPower().hearSubtleNoises();
		hero.getPower().trackBySmell();
	}
	public static void main(String[] args) {
		DogBoy dogBoy = new DogBoy();
		useSuperHearing(dogBoy);
		superFind(dogBoy);
		List<? extends SuperHearing> audioBoys;
		// error
		// List<? extends SuperHearing & SuperSmell> dogBoys;
	}
}

/**
 * @Title RoShamBo2.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo2
 * @Description 多路分发：石头剪刀布
 * <p>使用构造器来初始化每个enum实例，并以一组结果为参数，形成类似查询表的结构
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public enum RoShamBo2 implements Competitor<RoShamBo2> {
	  PAPER(DRAW, LOSE, WIN),
	  SCISSORS(WIN, DRAW, LOSE),
	  ROCK(LOSE, WIN, DRAW);
	  private Outcome vPAPER, vSCISSORS, vROCK;
	  RoShamBo2(Outcome paper,Outcome scissors,Outcome rock) {
	    this.vPAPER = paper;
	    this.vSCISSORS = scissors;
	    this.vROCK = rock;
	  }	
	  public Outcome compete(RoShamBo2 it) {
	    switch(it) {
	      default:
	      case PAPER: return vPAPER;
	      case SCISSORS: return vSCISSORS;
	      case ROCK: return vROCK;
	    }
	  }
	  public static void main(String[] args) {
	    RoShamBo.play(RoShamBo2.class, 20);
	  }
}

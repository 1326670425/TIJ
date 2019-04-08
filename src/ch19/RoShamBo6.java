/**
 * @Title RoShamBo6.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo6
 * @Description 多路分发：石头剪刀布。使用二维数组
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
enum RoShamBo6 implements Competitor<RoShamBo6>{
	PAPER, SCISSORS, ROCK;
	private static Outcome[][] table = {
			{DRAW, LOSE, WIN},// PAPER
			{WIN, DRAW, LOSE},// SCISSORS
			{LOSE, WIN, DRAW},// ROCK
	};
	public Outcome compete(RoShamBo6 other){
		return table[this.ordinal()][other.ordinal()];
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo6.class, 20);
	}
}

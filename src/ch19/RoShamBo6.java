/**
 * @Title RoShamBo6.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo6
 * @Description ��·�ַ���ʯͷ��������ʹ�ö�ά����
 * @author �����
 * @date 2019��4��8��
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

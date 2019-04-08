/**
 * @Title RoShamBo2.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo2
 * @Description ��·�ַ���ʯͷ������
 * <p>ʹ�ù���������ʼ��ÿ��enumʵ��������һ����Ϊ�������γ����Ʋ�ѯ��Ľṹ
 * @author �����
 * @date 2019��4��8��
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

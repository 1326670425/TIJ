/**
 * @Title RoShamBo3.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo3
 * @Description ��·������ʯͷ������
 * <p>ʹ�ó�����صķ���������ͨ�����ַ�ʽ��enumʵ����Ȼ���Ծ��в�ͬ����Ϊ�����������Բ������ͣ����ܽ�����Ϊ����ǩ���еĲ���������ʹ�ã�
 * ���������switch�����
 * @author �����
 * @date 2019��4��8��
 * 
 */
public enum RoShamBo3 implements Competitor<RoShamBo3> {
	  PAPER {
	    public Outcome compete(RoShamBo3 it) {
	      switch(it) {
	        default: // To placate the compiler
	        case PAPER: return DRAW;
	        case SCISSORS: return LOSE;
	        case ROCK: return WIN;
	      }
	    }
	  },
	  SCISSORS {
	    public Outcome compete(RoShamBo3 it) {
	      switch(it) {
	        default:
	        case PAPER: return WIN;
	        case SCISSORS: return DRAW;
	        case ROCK: return LOSE;
	      }
	    }
	  },
	  ROCK {
	    public Outcome compete(RoShamBo3 it) {
	      switch(it) {
	        default:
	        case PAPER: return LOSE;
	        case SCISSORS: return WIN;
	        case ROCK: return DRAW;
	      }
	    }
	  };
	  public abstract Outcome compete(RoShamBo3 it);
	  public static void main(String[] args) {
	    RoShamBo.play(RoShamBo3.class, 20);
	  }
}

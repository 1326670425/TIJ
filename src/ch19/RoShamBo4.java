/**
 * @Title RoShamBo4.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch19;

/**
 * @ClassName RoShamBo4
 * @Description RoShamBo3ѹ����
 * @author �����
 * @date 2019��4��8��
 * 
 */
public enum RoShamBo4 implements Competitor<RoShamBo4> {
	  ROCK {
	    public Outcome compete(RoShamBo4 opponent) {
	      return compete(SCISSORS, opponent);
	    }
	  },
	  SCISSORS {
	    public Outcome compete(RoShamBo4 opponent) {
	      return compete(PAPER, opponent);
	    }
	  },
	  PAPER {
	    public Outcome compete(RoShamBo4 opponent) {
	      return compete(ROCK, opponent);
	    }
	  };
	  Outcome compete(RoShamBo4 loser, RoShamBo4 opponent) {
	    return ((opponent == this) ? Outcome.DRAW
	        : ((opponent == loser) ? Outcome.WIN
	                               : Outcome.LOSE));
	  }
	  public static void main(String[] args) {
	    RoShamBo.play(RoShamBo4.class, 20);
	  }
}

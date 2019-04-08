/**
 * @Title RoShamBo3.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import static ch19.Outcome.*;
/**
 * @ClassName RoShamBo3
 * @Description 多路并发：石头剪刀布
 * <p>使用常量相关的方法。不过通过这种方式，enum实例虽然可以具有不同的行为，但是它们仍不是类型，不能将其作为方法签名中的参数类型来使用，
 * 最好是用在switch语句中
 * @author 吴扬颉
 * @date 2019年4月8日
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

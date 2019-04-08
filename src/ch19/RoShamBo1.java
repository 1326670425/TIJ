/**
 * @Title RoShamBo1.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch19;
import java.util.*;
import static ch19.Outcome.*;

interface Item {
	  Outcome compete(Item it);
	  Outcome eval(Paper p);
	  Outcome eval(Scissors s);
	  Outcome eval(Rock r);
}

class Paper implements Item {
  public Outcome compete(Item it) { return it.eval(this); }
  public Outcome eval(Paper p) { return DRAW; }
  public Outcome eval(Scissors s) { return WIN; }
  public Outcome eval(Rock r) { return LOSE; }
  public String toString() { return "Paper"; }
}	

class Scissors implements Item {
  public Outcome compete(Item it) { return it.eval(this); }
  public Outcome eval(Paper p) { return LOSE; }
  public Outcome eval(Scissors s) { return DRAW; }
  public Outcome eval(Rock r) { return WIN; }
  public String toString() { return "Scissors"; }
}

class Rock implements Item {
  public Outcome compete(Item it) { return it.eval(this); }
  public Outcome eval(Paper p) { return WIN; }
  public Outcome eval(Scissors s) { return LOSE; }
  public Outcome eval(Rock r) { return DRAW; }
  public String toString() { return "Rock"; }
}	

/**
 * @ClassName RoShamBo1
 * @Description 多路分发：石头剪刀布
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class RoShamBo1 {
	  static final int SIZE = 20;
	  private static Random rand = new Random(47);
	  public static Item newItem() {
	    switch(rand.nextInt(3)) {
	      default:
	      case 0: return new Scissors();
	      case 1: return new Paper();
	      case 2: return new Rock();
	    }
	  }
	  public static void match(Item a, Item b) {
	    System.out.println(
	      a + " vs. " + b + ": " +  a.compete(b));
	  }
	  public static void main(String[] args) {
	    for(int i = 0; i < SIZE; i++)
	      match(newItem(), newItem());
	  }
}

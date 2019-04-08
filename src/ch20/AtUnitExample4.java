/**
 * @Title AtUnitExample4.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.util.*;
import net.mindview.atunit.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
/**
 * @ClassName AtUnitExample4
 * @Description 使用@TestProperty注解， 向单元测试添加一些额外的域，由它注解的域表示只在单元测试中使用
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */

public class AtUnitExample4 {
	  static String theory = "All brontosauruses " +
	    "are thin at one end, much MUCH thicker in the " +
	    "middle, and then thin again at the far end.";
	  private String word;
	  private Random rand = new Random(); // Time-based seed
	  public AtUnitExample4(String word) { this.word = word; }
	  public String getWord() { return word; }
	  public String scrambleWord() {
	    List<Character> chars = new ArrayList<Character>();
	    for(Character c : word.toCharArray())
	      chars.add(c);
	    Collections.shuffle(chars, rand);
	    StringBuilder result = new StringBuilder();
	    for(char ch : chars)
	      result.append(ch);
	    return result.toString();
	  }
	  @TestProperty static List<String> input =
	    Arrays.asList(theory.split(" "));
	  @TestProperty
	    static Iterator<String> words = input.iterator();
	  @TestObjectCreate static AtUnitExample4 create() {
	    if(words.hasNext())
	      return new AtUnitExample4(words.next());
	    else
	      return null;
	  }
	  @Test boolean words() {
	    print("'" + getWord() + "'");
	    return getWord().equals("are");
	  }
	  @Test boolean scramble1() {
	    // Change to a specific seed to get verifiable results:
	    rand = new Random(47);
	    print("'" + getWord() + "'");
	    String scrambled = scrambleWord();
	    print(scrambled);
	    return scrambled.equals("lAl");
	  }
	  @Test boolean scramble2() {
	    rand = new Random(74);
	    print("'" + getWord() + "'");
	    String scrambled = scrambleWord();
	    print(scrambled);
	    return scrambled.equals("tsaeborornussu");
	  }
	  public static void main(String[] args) throws Exception {
	    System.out.println("starting");
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit AtUnitExample4");
	  }
}

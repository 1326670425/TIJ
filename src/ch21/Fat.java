/**
 * @Title Fat.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月13日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName Fat
 * @Description 演示对象池所用的对象： 构造器运行费时
 * @author 吴扬颉
 * @date 2019年4月13日
 * 
 */
public class Fat {
	  private volatile double d; // Prevent optimization
	  private static int counter = 0;
	  private final int id = counter++;
	  public Fat() {
	    // Expensive, interruptible operation:
	    for(int i = 1; i < 10000; i++) {
	      d += (Math.PI + Math.E) / (double)i;
	    }
	  }
	  public void operation() { System.out.println(this); }
	  public String toString() { return "Fat id: " + id; }
}

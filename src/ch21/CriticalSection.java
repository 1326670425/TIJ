/**
 * @Title CriticalSection.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.*;

class Pair { // Not thread-safe
	  private int x, y;
	  public Pair(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  public Pair() { this(0, 0); }
	  public int getX() { return x; }
	  public int getY() { return y; }
	  public void incrementX() { x++; }
	  public void incrementY() { y++; }
	  public String toString() {
	    return "x: " + x + ", y: " + y;
	  }
	  public class PairValuesNotEqualException
	  extends RuntimeException {
	    public PairValuesNotEqualException() {
	      super("Pair values not equal: " + Pair.this);
	    }
	  }
	  // Arbitrary invariant -- both variables must be equal:
	  public void checkState() {
	    if(x != y)
	      throw new PairValuesNotEqualException();
	  }
}

// Protect a Pair inside a thread-safe class:
abstract class PairManager {
	  AtomicInteger checkCounter = new AtomicInteger(0);
	  protected Pair p = new Pair();
	  private List<Pair> storage =
	    Collections.synchronizedList(new ArrayList<Pair>());
	  public synchronized Pair getPair() {
	    // Make a copy to keep the original safe:
	    return new Pair(p.getX(), p.getY());
	  }
	  // Assume this is a time consuming operation
	  protected void store(Pair p) {
	    storage.add(p);
	    try {
	      TimeUnit.MILLISECONDS.sleep(50);
	    } catch(InterruptedException ignore) {}
	  }
	  public abstract void increment();
}

// Synchronize the entire method:
class PairManager1 extends PairManager {
	  // synchronized不属于方法特征签名的组成部分，所以可以在覆盖的时候加上去
	  public synchronized void increment() {
	    p.incrementX();
	    p.incrementY();
	    store(getPair());
	  }
}

// Use a critical section:
class PairManager2 extends PairManager {
	  public void increment() {
	    Pair temp;
	    synchronized (this) {
	      p.incrementX();
	      p.incrementY();
	      temp = getPair();
	    }
	    store(temp);
	  }
}

class PairManipulator implements Runnable {
	  private PairManager pm;
	  public PairManipulator(PairManager pm) {
	    this.pm = pm;
	  }
	  public void run() {
	    while(true)
	      pm.increment();
	  }
	  public String toString() {
	    return "Pair: " + pm.getPair() +
	      " checkCounter = " + pm.checkCounter.get();
	  }
}

class PairChecker implements Runnable {
	  private PairManager pm;
	  public PairChecker(PairManager pm) {
	    this.pm = pm;
	  }
	  public void run() {
	    while(true) {
	      pm.checkCounter.incrementAndGet();
	      pm.getPair().checkState();
	    }
	  }
}

/**
 * @ClassName CriticalSection
 * @Description 同步控制块与对整个方法进行同步控制的比较。
 * <p>同步控制块：使用synchronized关键字建立，指定某个对象，此对象的锁被用来对花括号内的代码进行同步控制
 * <pre>
 * synchronized(syncObject){
 *   // 这里的代码一次只能被一个任务访问
 * }
 * </pre>
 * 此外，还演示了如何把一个非保护类型的类，在其他类的保护和控制下，用于多线程的环境
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class CriticalSection {
	  // Test the two different approaches:
	  static void
	  testApproaches(PairManager pman1, PairManager pman2) {
	    ExecutorService exec = Executors.newCachedThreadPool();
	    PairManipulator
	      pm1 = new PairManipulator(pman1),
	      pm2 = new PairManipulator(pman2);
	    PairChecker
	      pcheck1 = new PairChecker(pman1),
	      pcheck2 = new PairChecker(pman2);
	    exec.execute(pm1);
	    exec.execute(pm2);
	    exec.execute(pcheck1);
	    exec.execute(pcheck2);
	    try {
	      TimeUnit.MILLISECONDS.sleep(500);
	    } catch(InterruptedException e) {
	      System.out.println("Sleep interrupted");
	    }
	    System.out.println("pm1: " + pm1 + "\npm2: " + pm2);
	    System.exit(0);
	  }
	  public static void main(String[] args) {
	    PairManager
	      pman1 = new PairManager1(),
	      pman2 = new PairManager2();
	    testApproaches(pman1, pman2);
	  }
}

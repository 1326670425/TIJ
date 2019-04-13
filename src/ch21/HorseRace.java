/**
 * @Title HorseRace.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月12日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Horse implements Runnable {
	  private static int counter = 0;
	  private final int id = counter++;
	  private int strides = 0; // 步伐
	  private static Random rand = new Random(47);
	  private static CyclicBarrier barrier;
	  public Horse(CyclicBarrier b) { barrier = b; }
	  public synchronized int getStrides() { return strides; }
	  public void run() {
	    try {
	      while(!Thread.interrupted()) {
	        synchronized(this) {
	          strides += rand.nextInt(3); // Produces 0, 1 or 2
	        }
	        barrier.await();
	      }
	    } catch(InterruptedException e) {
	      // A legitimate way to exit
	    } catch(BrokenBarrierException e) {
	      // This one we want to know about
	      throw new RuntimeException(e);
	    }
	  }
	  public String toString() { return "Horse " + id + " "; }
	  public String tracks() {
	    StringBuilder s = new StringBuilder();
	    for(int i = 0; i < getStrides(); i++)
	      s.append("*");
	    s.append(id);
	    return s.toString();
	  }
}


/**
 * @ClassName HorseRace
 * @Description CyclicBarrier适用场景：创建一组任务，它们并行工作，然后在执行到下一个步骤前等待，直到所有任务都完成。
 * 它使得所有的并行任务都将在栅栏处列队，一致向前移动，这很像CountDownLatch，不过CountDownLatch是只触发一次，CyclicBarrier可以多次重用
 * @author 吴扬颉
 * @date 2019年4月12日
 * 
 */
public class HorseRace {
	  static final int FINISH_LINE = 75;
	  private List<Horse> horses = new ArrayList<Horse>();
	  private ExecutorService exec =
	    Executors.newCachedThreadPool();
	  private CyclicBarrier barrier;
	  public HorseRace(int nHorses, final int pause) {
	    barrier = new CyclicBarrier(nHorses, new Runnable() {
	      public void run() {
	        StringBuilder s = new StringBuilder();
	        for(int i = 0; i < FINISH_LINE; i++)
	          s.append("="); // The fence on the racetrack
	        print(s);
	        for(Horse horse : horses)
	          print(horse.tracks());
	        for(Horse horse : horses)
	          if(horse.getStrides() >= FINISH_LINE) {
	            print(horse + "won!");
	            exec.shutdownNow();
	            return;
	          }
	        try {
	          TimeUnit.MILLISECONDS.sleep(pause);
	        } catch(InterruptedException e) {
	          print("barrier-action sleep interrupted");
	        }
	      }
	    });
	    for(int i = 0; i < nHorses; i++) {
	      Horse horse = new Horse(barrier);
	      horses.add(horse);
	      exec.execute(horse);
	    }
	  }
	  public static void main(String[] args) {
	    int nHorses = 7;
	    int pause = 200;
	    if(args.length > 0) { // Optional argument
	      int n = new Integer(args[0]);
	      nHorses = n > 0 ? n : nHorses;
	    }
	    if(args.length > 1) { // Optional argument
	      int p = new Integer(args[1]);
	      pause = p > -1 ? p : pause;
	    }
	    new HorseRace(nHorses, pause);
	  }
}

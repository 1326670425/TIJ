/**
 * @Title AtomicityTest.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName AtomicityTest
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class AtomicityTest implements Runnable{
	private int i = 0;
	public 
	// synchronized 
	int getValue(){ return i; }
	private synchronized void evenIncrement(){ i++; i++; }
	public void run(){
		while(true)
			evenIncrement();
	}
	// 尽管return i是原子操作，但是缺少同步使得其数值可以在处于不稳定的中间状态时被读取，除此之外，由于i也不是volatile的，因此还可能存在可视性问题
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true){
			int val = at.getValue();
			if(val % 2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}

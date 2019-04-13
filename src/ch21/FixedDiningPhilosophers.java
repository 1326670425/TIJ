/**
 * @Title FixedDiningPhilosophers.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��12��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName FixedDiningPhilosophers
 * @Description �ƻ���������������ѭ���ȴ���
 * @author �����
 * @date 2019��4��12��
 * 
 */
public class FixedDiningPhilosophers {
	  public static void main(String[] args) throws Exception {
		    int ponder = 5;
		    if(args.length > 0)
		      ponder = Integer.parseInt(args[0]);
		    int size = 5;
		    if(args.length > 1)
		      size = Integer.parseInt(args[1]);
		    ExecutorService exec = Executors.newCachedThreadPool();
		    Chopstick[] sticks = new Chopstick[size];
		    for(int i = 0; i < size; i++)
		      sticks[i] = new Chopstick();
		    for(int i = 0; i < size; i++)
		      if(i < (size-1))
		        exec.execute(new Philosopher(
		          sticks[i], sticks[i+1], i, ponder));
		      else
		        exec.execute(new Philosopher(
		          sticks[0], sticks[i], i, ponder));// ������ѧ�����Һ������һ����ѧ���������
		    if(args.length == 3 && args[2].equals("timeout"))
		      TimeUnit.SECONDS.sleep(5);
		    else {
		      System.out.println("Press 'Enter' to quit");
		      System.in.read();
		    }
		    exec.shutdownNow();
		  }
}

/**
 * @Title ExplicitCriticalSection.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月11日
 * @version 1.0
 */
package ch21;
import java.util.concurrent.locks.*;

// 同步整个方法
class ExplicitPairManager1 extends PairManager{
	private Lock lock = new ReentrantLock();
	public synchronized void increment(){
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			store(getPair());
		}finally{
			lock.unlock();
		}
	}
}
// 使用同步控制块
class ExplicitPairManager2 extends PairManager{
	private Lock lock = new ReentrantLock();
	public void increment(){
		Pair temp;
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}finally{
			lock.unlock();
		}
		store(temp);
	}
}

/**
 * @ClassName ExplicitCriticalSection
 * @Description 使用显式的Lock对象来创建临界区
 * @author 吴扬颉
 * @date 2019年4月11日
 * 
 */
public class ExplicitCriticalSection {
	public static void main(String[] args) throws Exception{
		PairManager
			pman1 = new ExplicitPairManager1(),
			pman2 = new ExplicitPairManager2();
		CriticalSection.testApproaches(pman1, pman2);
	}
}

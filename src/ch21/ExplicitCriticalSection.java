/**
 * @Title ExplicitCriticalSection.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��11��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.locks.*;

// ͬ����������
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
// ʹ��ͬ�����ƿ�
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
 * @Description ʹ����ʽ��Lock�����������ٽ���
 * @author �����
 * @date 2019��4��11��
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

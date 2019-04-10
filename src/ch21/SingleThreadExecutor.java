/**
 * @Title SingleThreadExecutor.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SingleThreadExecutor
 * @Description SingleThreadExecutor�����߳���Ϊ1��FixedThreadPool�������ϣ������һ���߳����������е��κ����ﶼ�����õġ�
 * �����ṩ��һ����Ҫ�Ĳ�����֤�������̲߳��ᱻ�������ã����ı�����ļ�������
 * �����SingleThreadExecutor�ύ�˶��������ô��Щ����˳��ִ�С�
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}

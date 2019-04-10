/**
 * @Title SettingDefaultHandler.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;
import java.util.concurrent.*;
/**
 * @ClassName SettingDefaultHandler
 * @Description ��������õ���ͬ���쳣����������ô������Thread������һ����̬�򣬲��������������ΪĬ�ϵ�δ�����쳣��������
 * <p>���������ֻ���ڲ������߳�ר�õ�δ�����쳣������������²Żᱻ���á�ϵͳ�����߳�ר�а汾�����û�з��֣������߳����Ƿ����ר�е�
 * uncaughtException()���������Ҳû�У��Ż����defaultUncaughtExceptionHandler��
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SettingDefaultHandler {
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(
				new MyUncaughtExceptionHandler());
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}
}

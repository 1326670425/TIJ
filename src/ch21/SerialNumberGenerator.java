/**
 * @Title SerialNumberGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SerialNumberGenerator
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public class SerialNumberGenerator {
	// ��������Ҫִ�������Ƴ���ȡ��д��������Ż�����Щ������Ŀ�������߳��еľֲ�����ά���������ľ�ȷͬ��
	private static volatile int serialNumber = 0;
	public static int nextSerialNumber(){
		return serialNumber++; // �����̰߳�ȫ��
	}
}

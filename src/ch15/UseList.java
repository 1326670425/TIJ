/**
 * @Title UseList.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;
import java.util.*;

interface Payable<T>{}
/*
class Employes implements Payable<Employes>{}
class Hourly extends Employes implements Payable<Hourly>{}
*/

class Employes implements Payable{}
class Hourly extends Employes implements Payable{}

/**
 * @ClassName UseList
 * @Description ���ڲ����Ĵ��ڣ����������Ĳ���������ͬ�Ĳ����б�ʱ���������أ������ڷ������ϼ�������
 * <p>ͬ���ģ�����ʵ��ͬһ�����ͽӿڵ��������塣��Ϊ��������ͬһ���ӿڡ������Ƴ����Ͳ���ȴ�ֿ��Ա���
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class UseList<T, W> {
	// void f(List<T> v){}
	// void f(List<W> v){}
	void f1(List<T> v){}
	void f2(List<W> v){}
}

/**
 * @Title CRGWithBasicHolder.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

class Subtype extends BasicHolder<Subtype>{}

/**
 * @ClassName CRGWithBasicHolder
 * @Description �Źֵ�ѭ������(CRG):�����õ�������������������ζ�ŷ��ͻ�������һ�������е�����Ĺ������ܵ�ģ�壬������Щ���ܶ��������в����ͷ���ֵ��
 * ��ʹ�õ������͡�Ҳ����˵���������������н�ʹ��ȷ�����Ͷ����ǻ�����
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class CRGWithBasicHolder {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
	}
}

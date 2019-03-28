/**
 * @Title GenericsAndReturnTypes.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

interface GenericGetter<T extends GenericGetter<T>>{
	T get();
}

interface Getter extends GenericGetter<Getter>{}

/**
 * @ClassName GenericsAndReturnTypes
 * @Description ���޶�������ʵ�Ͻ�����ȷ�еĵ���������Ϊ�䷵��ֵ
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class GenericsAndReturnTypes {
	void test(Getter g){
		Getter result = g.get();
		GenericGetter gg = g.get();
	}
}

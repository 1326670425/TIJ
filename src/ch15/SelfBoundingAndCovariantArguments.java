/**
 * @Title SelfBoundingAndCovariantArguments.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
	void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter>{
	
}


/**
 * @ClassName SelfBoundingAndCovariantArguments
 * @Description ��ʹ�����޶�����ʱ���ڵ�������ֻ��һ����������������������ܵ������Ͷ����ǻ�����
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1, Setter s2, SelfBoundSetter sbs){
		s1.set(s2);
		// s1.set(sbs);// Error: set(Setter) in SelfBoundSetter<Setter> can't be applied to (SelfBoundSetter)
	}
}

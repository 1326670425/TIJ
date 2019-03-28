/**
 * @Title CaptureConversion.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName CaptureConversion
 * @Description ����ת���������һ��ʹ��<?>�ķ�������ԭ�����ͣ���ô�Ա�������˵�����ܻ��ƶϳ�ʵ�ʵ����Ͳ�����ʹ������������Իص���������һ��ʹ��
 * ���ȷ�����͵ķ�����
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class CaptureConversion {
	static <T> void f1(Holder<T> holder){
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	static void f2(Holder<?> holder){
		f1(holder);
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		// f1()�����Ͳ�����ȷ�У���û��ͨ����ͱ߽硣f2()�в����Ǹ��޽�ͨ��������������ȥ��δ֪��
		// ������f2()�е���f1()�����������ڵ���f2()��ʱ�򱻲�����˿�������f1()��
		Holder raw = new Holder<Integer>(1);
		f1(raw);
		f2(raw);
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		f2(rawBasic);
		Holder<?> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
	}
}

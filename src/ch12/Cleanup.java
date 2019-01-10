/**
 * @Title Cleanup.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

/**
 * @ClassName Cleanup
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class Cleanup {
	public static void main(String[] args) {
		/**
		 * ��InputFile����Ĺ��������Լ���try��������Ч���������ʧ�ܣ�������ⲿ��catch��䣬��dispose()���ᱻ���á�
		 * �����������ɹ��������ڹ���֮����һ���µ�try���飬ִ�������finally���ڲ���try�����������
		 * ������finally�Ӿ��ڹ���ʧ��ʱ�ǲ���ִ�еģ��ڹ���ɹ�ʱ����ִ�С�
		 * <p>����ͨ�õ�������÷��ڹ��������׳��κ��쳣ʱҲ�Ƽ�ʹ�ã������������:�ڴ�����Ҫ����Ķ���֮����������һ��try-finally����
		 */
		try{
			InputFile in = new InputFile("Cleanup.java");
			try{
				String s;
				int i = 1;
				while((s = in.getLine()) != null)
					;// ��ȡ����
			}catch(Exception e){
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		}catch(Exception e){
			System.out.println("InputFile construction failed");
		}
	}
}

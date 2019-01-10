/**
 * @Title StormyInning.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){}//�׳����ܼ����쳣
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

/**
 * @ClassName StormyInning
 * @Description �����Ƿ�����ʱ��ֻ���׳��ڻ��෽�����쳣˵�����г�����Щ�쳣��
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class StormyInning extends Inning implements Storm{
	// ��������������µ��쳣����������봦����๹�����׳����쳣
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws Foul, BaseballException {}
	// �����׳����쳣����ͻ���һ��
	//!void walk() throws PopFoul{} //Compile error
	// �ӿڲ�����ӻ����м̳й��������еķ�������µ��쳣
	// Storm���event()�������ܸı���Inning�е�event()�������쳣�ӿ�
	//!public void event() throws RainedOut{}
	// ���������û�еķ������ǿ�������쳣��
	public void rainHard() throws RainedOut{}
	// ����ѡ���׳��κ��쳣�����ܻ�������׳���
	public void event(){}
	// ���Ƿ��������׳��̳������쳣
	// PopFoul�̳���Foul�����Զ��ڻ����׳�Foul�����������׳�PopFoulҲһ���ܱ�����
	public void atBat() throws PopFoul{}
	public static void main(String[] args) {
		try{
			StormyInning si = new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			System.out.println("Pop foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}
		try{
			// ������׻ᷢ��ʲô��
			Inning i = new StormyInning();
			i.atBat();
			// �����ȥ����ӻ��෽�����׳����쳣
		}catch(Strike e){
			System.out.println("Strike");
		}catch(Foul e){
			System.out.println("Foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}
	}
}

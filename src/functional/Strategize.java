/**
 * @Title Strategize.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;

import ch21.MainThread;

interface Strategy {
	String approach(String msg);
}

class Soft implements Strategy {
	public String approach(String msg) {
		return msg.toLowerCase() + "?";
	}
}

class Unrelated {
	static String twice(String msg) {
		return msg + " " + msg;
	}
}

/**
 * @ClassName Strategize
 * @Description ����ʽ����¾ɷ�ʽ�Ա�
 * <p>��ͳ��ʽ����1��ʵ�ֽӿ���������ͬ����Ϊ��2�������ڲ���
 * <p>Lambda���ʽ���� -> �ָ��������ͺ����壬��ͷ����ǲ������ұ��Ǵ�Lambda���صı��ʽ���������塣
 * <p>�������ã��� :: ���֣����������������ƣ��ұ��Ƿ������ƣ�û�в����б�
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class Strategize {
	Strategy strategy;
	String msg;
	Strategize(String msg) {
		strategy = new Soft();
		this.msg = msg;
	}
	
	void communicate() {
		System.out.println(strategy.approach(msg));
	}
	
	void changeStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public static void main(String[] args) {
		Strategy[] strategies = {
				new Strategy() {
					public String approach(String msg) {
						return msg.toUpperCase() + "!";
					}
				},							// �����ڲ��෽ʽ
				msg -> msg.substring(0, 5), //Lambda���ʽ
				Unrelated::twice			// ��������
		};
		Strategize s = new Strategize("Hello there");
		s.communicate();
		for(Strategy newStrategy : strategies) {
			s.changeStrategy(newStrategy);
			s.communicate();
		}
	}
}

/**
 * @Title CovariantReturn.java
 * @Package ch08
 * @Description TODO
 * @author �����
 * @date 2019��1��5��
 * @version 1.0
 */
package ch08;

class Grain{
	public String toString(){
		return "Grain";
	}
}
class Wheat extends Grain{
	public String toString(){
		return "Wheat";
	}
}
class Mill{
	Grain process(){ return new Grain(); }
}
class WheatMill extends Mill{
	Wheat process(){ return new Wheat(); }
}

/**
 * @ClassName CovariantReturn
 * @Description Э�䷵�����ͣ���ʾ�ڵ������еı����Ƿ������Է��ػ��෽���ķ������͵�ĳ����������
 * @author �����
 * @date 2019��1��5��
 * 
 */
public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}

/**
 * @Title Groundhog2.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��3��31��
 * @version 1.0
 */
package ch17;

/**
 * @ClassName Groundhog2
 * @Description Object.equals()�Ƚ϶���ĵ�ַ�����Ҫʹ���Լ�������ΪHashMap�ļ�����Ҫͬʱ����equals()������hashCode()����
 * @author �����
 * @date 2019��3��31��
 * 
 */
public class Groundhog2 extends Groundhog{
	public Groundhog2(int n){ super(n); }
	public int hashCode(){ return number; }
	public boolean equals(Object o){
		// ˳�������o�ǲ���null����Ϊ���instanceof�����null�����᷵��false
		return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
	}
}

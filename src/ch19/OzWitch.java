/**
 * @Title OzWitch.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * @version 1.0
 */
package ch19;
import static net.mindview.util.Print.*;
/**
 * @ClassName OzWitch
 * @Description ���˲��ܼ̳���enum֮�⣬�������Խ�enum����һ�������࣬������������ӷ���
 * <p>�������ض�ö��ʵ�����������
 * @author �����
 * @date 2019��4��4��
 * 
 */
public enum OzWitch {
	// �����ȶ���enumʵ��������������
	WEST("Miss Gulch, aka the Wicked Witch of the West"),
	NORTH("Glinda, the Good Witch of the North"),
	EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"),
	// ���Ҫ�����Լ��ķ�����enumʵ���������ӷֺ�
	
	SOUTH("Good by inferencem but missing");
	private String description;
	private OzWitch(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public static void main(String[] args) {
		for(OzWitch witch : OzWitch.values())
			print(witch + ": " + witch.getDescription());
	}
}

/**
 * @Title SpaceShipDelegation.java
 * @Package ch07
 * @Description ����
 * @author �����
 * @date 2019��1��4��
 * @version 1.0
 */
package ch07;

/**
 * @ClassName SpaceShipDelegation
 * @Description ����
 * @author �����
 * @date 2019��1��4��
 * 
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name){
		this.name = name;
	}
	public void up(int velocity){
		controls.up(velocity);
	}
	public static void main(String[] args){
		SpaceShipDelegation protector = new SpaceShipDelegation("CHANGE");
		protector.up(2);
	}
}

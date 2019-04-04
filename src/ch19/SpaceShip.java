/**
 * @Title SpaceShip.java
 * @Package ch19
 * @Description TODO
 * @author �����
 * @date 2019��4��4��
 * @version 1.0
 */
package ch19;

/**
 * @ClassName SpaceShip
 * @Description ����toString()����
 * @author �����
 * @date 2019��4��4��
 * 
 */
public enum SpaceShip {
	SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
	public String toString(){
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}
	public static void main(String[] args) {
		for(SpaceShip s : values())
			System.out.println(s);
	}
}

/**
 * @Title SpaceShip.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月4日
 * @version 1.0
 */
package ch19;

/**
 * @ClassName SpaceShip
 * @Description 覆盖toString()方法
 * @author 吴扬颉
 * @date 2019年4月4日
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

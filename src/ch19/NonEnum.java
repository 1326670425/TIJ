/**
 * @Title NonEnum.java
 * @Package ch19
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月7日
 * @version 1.0
 */
package ch19;

/**
 * @ClassName NonEnum
 * @Description 非枚举类调用getEnumConstants()
 * @author 吴扬颉
 * @date 2019年4月7日
 * 
 */
public class NonEnum {
	public static void main(String[] args) {
		Class<Integer> intClass = Integer.class;
		try{
			//此时此方法返回null，发生异常
			for(Object en : intClass.getEnumConstants())
				System.out.println(en);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

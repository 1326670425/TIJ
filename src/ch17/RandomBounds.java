/**
 * @Title RandomBounds.java
 * @Package ch17
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月1日
 * @version 1.0
 */
package ch17;

/**
 * @ClassName RandomBounds
 * @Description 测试Math.random()的边界值（ 真实区间为[0, 1) ）
 * @author 吴扬颉
 * @date 2019年4月1日
 * 
 */
public class RandomBounds {
	static void usage(){
		System.out.println("Usage");
		System.out.println("\tRandomBounds lower");
		System.out.println("\tRandomBounds upper");
		System.exit(1);
	}
	public static void main(String[] args) {
		if(args.length != 1)
			usage();
		if(args[0].equals("lower")){
			while(Math.random() != 0.0)
				; // Keep trying
			System.out.println("Produced 0.0!");
		}
		else if(args[0].equals("upper")){
			while(Math.random() != 1.0)
				;
			System.out.println("Produced 1.0!");
		}
		else
			usage();
	}
}

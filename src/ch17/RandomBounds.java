/**
 * @Title RandomBounds.java
 * @Package ch17
 * @Description TODO
 * @author �����
 * @date 2019��4��1��
 * @version 1.0
 */
package ch17;

/**
 * @ClassName RandomBounds
 * @Description ����Math.random()�ı߽�ֵ�� ��ʵ����Ϊ[0, 1) ��
 * @author �����
 * @date 2019��4��1��
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

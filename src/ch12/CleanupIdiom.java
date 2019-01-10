/**
 * @Title CleanupIdiom.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;

class NeedsCleanup{
	private static long counter = 1;
	private final long id = counter++;
	public void dispose(){
		System.out.println("NeedsCleanup " + id + " disposed");
	}
}

class ConstructionException extends Exception{}

class NeedsCleanup2 extends NeedsCleanup{
	public NeedsCleanup2() throws ConstructionException{}
}

/**
 * @ClassName CleanupIdiom
 * @Description ÿ����Ҫ������Ķ����ڴ����󣬸�һ��try-finally����
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class CleanupIdiom {
	public static void main(String[] args) {
		
		NeedsCleanup nc1 = new NeedsCleanup();
		try{
			// ...
		}finally{
			nc1.dispose();
		}
		
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try{
			// ...
		}finally{
			//���մ������෴˳��
			nc3.dispose();
			nc2.dispose();
		}
		
		try{
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try{
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try{
					// ...
				}finally{
					nc5.dispose();
				}
			}catch(ConstructionException e){// nc5����ʧ��
				System.out.println(e);
			}finally{
				nc4.dispose();
			}
		}catch(ConstructionException e){// nc4����ʧ��
			System.out.println(e);
		}
	}
}

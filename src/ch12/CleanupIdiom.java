/**
 * @Title CleanupIdiom.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
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
 * @Description 每个需要被清理的对象在创建后，跟一个try-finally语句块
 * @author 吴扬颉
 * @date 2019年1月10日
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
			//按照创建的相反顺序
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
			}catch(ConstructionException e){// nc5创建失败
				System.out.println(e);
			}finally{
				nc4.dispose();
			}
		}catch(ConstructionException e){// nc4创建失败
			System.out.println(e);
		}
	}
}

/**
 * @Title ReferenceCounting.java
 * @Package ch08
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch08;

class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared(){
		System.out.println("Creating " + this);
	}
	public void addRef(){
		refcount++;
	}
	protected void dispose(){
		if(--refcount == 0){
			System.out.println("Disposing " + this);
		}
	}
	public String toString(){
		return "Shared " + id;
	}
}
class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared){
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose(){
		System.out.println("disposing " + this);
		shared.dispose();
	}
	public String toString(){
		return "Composing " + id;
	}
}

/**
 * @ClassName ReferenceCounting
 * @Description 引用计数器，当引用数为0时才释放对象
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared),
				new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)};
		for (Composing composing2 : composing) {
			composing2.dispose();
		}
	}
}

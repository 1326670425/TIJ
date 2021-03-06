/**
 * @Title GenericCast.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class FixedSizeStack<T>{
	private int index = 0;
	private Object[] storage;
	public FixedSizeStack(int size){
		storage = new Object[size];
	}
	public void push(T item){ storage[index++] = item; }
	// 由于擦除，编译器无法知道这个转型是否安全，而且pop()实际上并没有执行转型
	// 因为T被擦除为Object，pop()实际上只是把Object转型为Object
	@SuppressWarnings("unchecked")
	public T pop(){ return (T)storage[--index]; }
}

/**
 * @ClassName GenericCast
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class GenericCast {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		FixedSizeStack<String>	strings = new FixedSizeStack<String>(SIZE);
		for(String s : "A B C D E F G H I J".split(" "))
			strings.push(s);
		for(int i = 0; i < SIZE; i++){
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}
}

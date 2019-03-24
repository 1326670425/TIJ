/**
 * @Title LinkedStack.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月24日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName LinkedStack
 * @Description 泛型实现栈，使用末端哨兵判断堆栈何时为空
 * @author 吴扬颉
 * @date 2019年3月24日
 * 
 */
public class LinkedStack<T> {
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){ item = null; next = null; }
		Node(U item, Node<U> next){
			this.item = item;
			this.next = next;
		}
		boolean end(){ return item == null && next == null; }
	}
	private Node<T> top = new Node<T>();
	public void push(T item){
		top = new Node<T>(item, top);
	}
	public T pop(){
		T result = top.item;
		if(!top.end())
			top = top.next;
		return result;
	}
	public static void main(String[] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s : "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s = lss.pop()) != null)
			System.out.println(s);
	}
}

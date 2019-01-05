/**
 * @Title Sequence.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月5日
 * @version 1.0
 */
package ch10;

interface Selector{
	boolean end();
	Object current();
	void next();
}


/**
 * @ClassName Sequence
 * @Description 链接到外部类,内部类自动拥有对其外围类所有成员的访问权
 * @author 吴扬颉
 * @date 2019年1月5日
 * 
 */
public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size){ items = new Object[size]; }
	public void add(Object x){
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end(){ return i == items.length; }
		public Object current(){ return items[i]; }
		public void next(){ if(i < items.length) i++; }
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}
}

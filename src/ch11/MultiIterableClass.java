/**
 * @Title MultiIterableClass.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch11;
import java.util.*;
/**
 * @ClassName MultiIterableClass
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class MultiIterableClass extends IterableClass{
	public Iterable<String> reversed(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				return new Iterator<String>(){
					int current = words.length - 1;
					public boolean hasNext(){ return current > -1; }
					public String next(){ return words[current--]; }
					public void remove(){ throw new UnsupportedOperationException(); }
				};
			}
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				List<String> shuffled = 
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));//����List��֪ʶ������shuffled�е����ã�û��Ӱ�쵽ԭ��������
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for(String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic)
			System.out.print(s + " ");
	}
}
// Collection.shuffle()����û��Ӱ�쵽ԭ�������飬��ֻ�Ǵ�����shuffled�е����á�֮����������ֻ����Ϊrandomized()����
// ��һ��ArrayList��Arrays.asList()�����Ľ����װ����������������Arrays.asList()����������List��ֱ�Ӵ��ң���ô���ͻ��޸ĵײ������

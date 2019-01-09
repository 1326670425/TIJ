/**
 * @Title ListIteration.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import ch14.pets.*;
import java.util.*;
/**
 * @ClassName ListIteration
 * @Description ListIterator:更强大的迭代器，只能用于List类的访问，可以双向移动，还可以产生相对于当前位置的前驱、后继的索引，
 * 并且使用set()方法替换它访问过的最后一个元素。可以通过调用listIterator()方法产生一个指向List开始处的ListIterator，并且还可以
 * 通过调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator。
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class ListIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()){
			System.out.println(it.next() + ", " + it.nextIndex() + 
					", " + it.previousIndex() + "; ");
		}
		System.out.println();
		while(it.hasPrevious()){
			System.out.println(it.previous().id() + " ");
		}
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
}

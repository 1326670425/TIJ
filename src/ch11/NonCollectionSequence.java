/**
 * @Title NonCollectionSequence.java
 * @Package ch11
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch11;
import java.util.*;
import ch14.pets.*;

class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}
/**
 * @ClassName NonCollectionSequence
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
public class NonCollectionSequence extends PetSequence{
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next(){ return pets[index++]; }
			//remove()为可选操作，这里简单抛出异常
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}
}

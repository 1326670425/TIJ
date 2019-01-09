/**
 * @Title NonCollectionSequence.java
 * @Package ch11
 * @Description TODO
 * @author �����
 * @date 2019��1��9��
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
 * @author �����
 * @date 2019��1��9��
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
			//remove()Ϊ��ѡ������������׳��쳣
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

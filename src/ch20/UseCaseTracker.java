/**
 * @Title UseCaseTracker.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import java.lang.reflect.*;
import java.util.*;
/**
 * @ClassName UseCaseTracker
 * @Description ע�⴦����
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl){
		for(Method m : cl.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc != null){
				System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for(int i : useCases)
			System.out.println("Warning: Missing use case-" + i);
	}
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);
	}
}

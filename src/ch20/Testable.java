/**
 * @Title Testable.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import net.mindview.atunit.*;
/**
 * @ClassName Testable
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class Testable {
	public void execute(){
		System.out.println("Executing..");
	}
	@Test void testExecute(){ execute(); }
}
/*
 * Test.java
 * import java.lang.annotation.*;
 * @Target(ElementType.METHOD) // ע��Ӧ����ʲô�ط�
 * @Retention(RetentionPolicy.RUNTIME) // ע��Ӧ����ʲô����SOURCE��Դ���룩��CLASS���ࣩ��RUNTIME������ʱ��
 * public @interface Test{}
 */
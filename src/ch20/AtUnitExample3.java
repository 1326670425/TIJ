/**
 * @Title AtUnitExample3.java
 * @Package ch20
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20;
import net.mindview.atunit.*;
import net.mindview.util.*;
/**
 * @ClassName AtUnitExample3
 * @Description ��ÿ����Ԫ���Զ��ԣ�@Unit����ʹ��Ĭ�ϵĹ�������Ϊ�ò����������ഴ��һ���µ�ʵ�������ڴ˶��������в��ԣ�Ȼ�����ö���
 * �Ա�����������Բ��������á���˴���������������������Ĭ�Ϲ������������û��Ĭ�Ϲ������������¶�����Ҫ���ӵĹ�����̣����Դ���һ��static
 * ������ר�Ÿ��������Ȼ����@TestObjectCreateע���ǡ�
 * <p>������@TestObjectCreateע��ķ�����������Ϊstatic���ҷ���һ�����ڲ��Ե����Ͷ���
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class AtUnitExample3 {
	  private int n;
	  public AtUnitExample3(int n) { this.n = n; }
	  public int getN() { return n; }
	  public String methodOne() {
	    return "This is methodOne";
	  }
	  public int methodTwo() {
	    System.out.println("This is methodTwo");
	    return 2;
	  }
	  @TestObjectCreate static AtUnitExample3 create() {
	    return new AtUnitExample3(47);
	  }
	  @Test boolean initialization() { return n == 47; }
	  @Test boolean methodOneTest() {
	    return methodOne().equals("This is methodOne");
	  }
	  @Test boolean m2() { return methodTwo() == 2; }
	  public static void main(String[] args) throws Exception {
	    OSExecute.command(
	      "java net.mindview.atunit.AtUnit AtUnitExample3");
	  }
}

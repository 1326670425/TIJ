/**
 * @Title People.java
 * @Package xml
 * @Description TODO
 * @author �����
 * @date 2019��4��3��
 * @version 1.0
 */
package xml;
import nu.xom.*;
import java.util.*;
/**
 * @ClassName People
 * @Description ��XML�ļ��з����л�
 * @author �����
 * @date 2019��4��3��
 * 
 */
public class People extends ArrayList<Person> {
	  public People(String fileName) throws Exception  {
		    Document doc = new Builder().build(fileName);
		    Elements elements =
		      doc.getRootElement().getChildElements();
		    for(int i = 0; i < elements.size(); i++)
		      add(new Person(elements.get(i)));
		  }
		  public static void main(String[] args) throws Exception {
		    People p = new People("People.xml");
		    System.out.println(p);
		  }
}

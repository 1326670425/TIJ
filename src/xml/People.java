/**
 * @Title People.java
 * @Package xml
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月3日
 * @version 1.0
 */
package xml;
import nu.xom.*;
import java.util.*;
/**
 * @ClassName People
 * @Description 从XML文件中反序列化
 * @author 吴扬颉
 * @date 2019年4月3日
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

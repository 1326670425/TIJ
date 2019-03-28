/**
 * @Title UseList.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.util.*;

interface Payable<T>{}
/*
class Employes implements Payable<Employes>{}
class Hourly extends Employes implements Payable<Hourly>{}
*/

class Employes implements Payable{}
class Hourly extends Employes implements Payable{}

/**
 * @ClassName UseList
 * @Description 由于擦除的存在，当被擦除的参数产生相同的参数列表时，不能重载，必须在方法名上加以区分
 * <p>同样的，不能实现同一个泛型接口的两个变体。因为擦除后是同一个接口。但是移除泛型参数却又可以编译
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class UseList<T, W> {
	// void f(List<T> v){}
	// void f(List<W> v){}
	void f1(List<T> v){}
	void f2(List<W> v){}
}

/**
 * @Title CovariantReturnTypes.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;

class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
	Base get();
}
interface DerivedGetter extends OrdinaryGetter{
	Derived get();
}

/**
 * @ClassName CovariantReturnTypes
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class CovariantReturnTypes {
	void test(DerivedGetter d){
		Derived d2 = d.get();
	}
}

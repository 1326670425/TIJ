/**
 * @Title CovariantReturnTypes.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
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
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class CovariantReturnTypes {
	void test(DerivedGetter d){
		Derived d2 = d.get();
	}
}

/**
 * @Title StormyInning.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{}
	public abstract void atBat() throws Strike, Foul;
	public void walk(){}//抛出不受检查的异常
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

/**
 * @ClassName StormyInning
 * @Description 当覆盖方法的时候，只能抛出在基类方法的异常说明里列出的那些异常。
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class StormyInning extends Inning implements Storm{
	// 可以向构造器添加新的异常，但是你必须处理基类构造器抛出的异常
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws Foul, BaseballException {}
	// 方法抛出的异常必须和基类一致
	//!void walk() throws PopFoul{} //Compile error
	// 接口不能向从基类中继承过来的已有的方法添加新的异常
	// Storm里的event()方法不能改变在Inning中的event()方法的异常接口
	//!public void event() throws RainedOut{}
	// 如果基类中没有的方法，是可以添加异常的
	public void rainHard() throws RainedOut{}
	// 可以选择不抛出任何异常，尽管基类可能抛出了
	public void event(){}
	// 覆盖方法可以抛出继承来的异常
	// PopFoul继承自Foul，所以对于基类抛出Foul，故派生类抛出PopFoul也一定能被捕获
	public void atBat() throws PopFoul{}
	public static void main(String[] args) {
		try{
			StormyInning si = new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			System.out.println("Pop foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}
		try{
			// 如果上抛会发生什么？
			Inning i = new StormyInning();
			i.atBat();
			// 你必须去捕获从基类方法中抛出的异常
		}catch(Strike e){
			System.out.println("Strike");
		}catch(Foul e){
			System.out.println("Foul");
		}catch(RainedOut e){
			System.out.println("Rained out");
		}catch(BaseballException e){
			System.out.println("Generic baseball exception");
		}
	}
}

/**
 * @Title ThrowGenericException.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月28日
 * @version 1.0
 */
package ch15;
import java.util.*;

interface Processor<T, E extends Exception>{
	void process(List<T> resultCollector) throws E;
}

class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>>{
	List<T> processAll() throws E{
		List<T> resultCollector = new ArrayList<T>();
		for(Processor<T, E> processor : this){
			processor.process(resultCollector);
		}
		return resultCollector;
	}
}

class Failure1 extends Exception{}

class Processor1 implements Processor<String, Failure1>{
	static int count = 3;
	public void process(List<String> resultCollector) throws Failure1{
		if(count-- > 1)
			resultCollector.add("Hep!");
		else
			resultCollector.add("Ho!");
		if(count < 0)
			throw new Failure1();
	}
}

class Failure2 extends Exception{}

class Processor2 implements Processor<Integer, Failure2>{
	static int count = 2;
	public void process(List<Integer> resultCollector) throws Failure2{
		if(count-- == 0)
			resultCollector.add(47);
		else
			resultCollector.add(11);
		if(count < 0)
			throw new Failure2();
	}
	
}

/**
 * @ClassName ThrowGenericException
 * @Description 由于擦除的原因，catch语句不能捕获泛型类型的异常，因为编译器和运行时都必须知道异常的确切类型。泛型类也不能直接或间接继承自Throwable
 * <p>但是参数类型可能会在一个方法的throws子句中用到。可以用来编写随检查型异常的类型而发生变化的泛型代码
 * @author 吴扬颉
 * @date 2019年3月28日
 * 
 */
public class ThrowGenericException {
	public static void main(String[] args) {
		ProcessRunner<String, Failure1> runner = new ProcessRunner<String, Failure1>();
		for(int i = 0; i < 3; i++)
			runner.add(new Processor1());
		try{
			System.out.println(runner.processAll());
		}catch(Failure1 e){
			System.out.println(e);
		}
		
		ProcessRunner<Integer, Failure2> runner2 = new ProcessRunner<Integer, Failure2>();
		for(int i = 0; i < 3; i++)
			runner2.add(new Processor2());
		try{
			System.out.println(runner2.processAll());
		}catch(Failure2 e){
			System.out.println(e);
		}
	}
}

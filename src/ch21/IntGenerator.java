/**
 * @Title IntGenerator.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName IntGenerator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public abstract class IntGenerator {
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel(){ canceled = true; }
	public boolean isCanceled(){ return canceled; }
}

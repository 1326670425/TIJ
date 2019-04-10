/**
 * @Title IntGenerator.java
 * @Package ch21
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * @version 1.0
 */
package ch21;

/**
 * @ClassName IntGenerator
 * @Description TODO
 * @author �����
 * @date 2019��4��10��
 * 
 */
public abstract class IntGenerator {
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel(){ canceled = true; }
	public boolean isCanceled(){ return canceled; }
}

/**
 * @Title SerialNumberGenerator.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName SerialNumberGenerator
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class SerialNumberGenerator {
	// 编译器不要执行热呢移除读取和写入操作的优化，这些操作的目的是用线程中的局部变量维护对这个域的精确同步
	private static volatile int serialNumber = 0;
	public static int nextSerialNumber(){
		return serialNumber++; // 不是线程安全的
	}
}

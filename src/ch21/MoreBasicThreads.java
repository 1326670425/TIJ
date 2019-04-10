/**
 * @Title MoreBasicThreads.java
 * @Package ch21
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月10日
 * @version 1.0
 */
package ch21;

/**
 * @ClassName MoreBasicThreads
 * @Description 单一线程（main()）在创建所有的LiftOff线程，所以id号唯一，如果多个线程创建LiftOff线程，
 * 则会出现多个线程拥有相同的id号的情况
 * @author 吴扬颉
 * @date 2019年4月10日
 * 
 */
public class MoreBasicThreads {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}
}

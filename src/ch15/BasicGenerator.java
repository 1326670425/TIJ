/**
 * @Title BasicGenerator.java
 * @Package ch15
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月25日
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicGenerator
 * @Description 通用的Generator，只要类有默认构造器
 * @author 吴扬颉
 * @date 2019年3月25日
 * 
 */
public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	public BasicGenerator(Class<T> type){ this.type = type; }
	public T next(){
		try{
			return type.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}

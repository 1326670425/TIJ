/**
 * @Title BasicGenerator.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��25��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName BasicGenerator
 * @Description ͨ�õ�Generator��ֻҪ����Ĭ�Ϲ�����
 * @author �����
 * @date 2019��3��25��
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

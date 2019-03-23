/**
 * @Title Factory.java
 * @Package ch14.factory
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年3月23日
 * @version 1.0
 */
package ch14.factory;

/**
 * @ClassName Factory
 * @Description 工厂方法设计模式
 * @author 吴扬颉
 * @date 2019年3月23日
 * 
 */
public interface Factory<T> {
	T create();
}

/**
 * @Title InheritInner.java
 * @Package ch10
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月9日
 * @version 1.0
 */
package ch10;

class WithInner{
	class Inner {}
}
/**
 * @ClassName InheritInner
 * @Description 内部类的继承
 * @author 吴扬颉
 * @date 2019年1月9日
 * 
 */
// 内部类的构造器必须连接到指向其外围类对象的引用，所以在继承内部类的时候，那个指向外围类对象的“秘密的”引用必须被初始化，而在导出类中不再存在可连接的默认对象。
public class InheritInner extends WithInner.Inner{
	//! InheritInner() {} 无法通过编译
	InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}

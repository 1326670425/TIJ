/**
 * @Title Cleanup.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

/**
 * @ClassName Cleanup
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class Cleanup {
	public static void main(String[] args) {
		/**
		 * 对InputFile对象的构造在其自己的try语句块中有效，如果构造失败，则进入外部的catch语句，而dispose()不会被调用。
		 * 但是如果构造成功，立即在构造之后建立一个新的try语句块，执行清理的finally与内部的try语句块相关联。
		 * 这样，finally子句在构造失败时是不会执行的，在构造成功时总是执行。
		 * <p>这种通用的清理惯用法在构造器不抛出任何异常时也推荐使用，其基本规则是:在创建需要清理的对象之后，立即进入一个try-finally语句块
		 */
		try{
			InputFile in = new InputFile("Cleanup.java");
			try{
				String s;
				int i = 1;
				while((s = in.getLine()) != null)
					;// 读取数据
			}catch(Exception e){
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		}catch(Exception e){
			System.out.println("InputFile construction failed");
		}
	}
}

/**
 * @Title InputFile.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;
import java.io.*;

/**
 * @ClassName InputFile
 * @Description 当涉及构造器时，构造器会把对象设置成安全的初始状态，但还会有别的动作（如打开文件），这类动作只有在对象使用完毕并且用户调用
 * 了特殊的清理方法后之后才能得以清理。如果构造器内抛出了异常，这些清理行为也许就不能正常工作了。
 * <p>因为finally每次都会执行清理代码，如果构造器在执行过程中半途而废，也许该对象的某些部分还没有被创建，但是却要在finally中清理，就会产生错误
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception{
		try{
			in = new BufferedReader(new FileReader(fname));
			// 其它可能抛出异常的代码
		}catch(FileNotFoundException e){
			System.out.println("Could not open " + fname);
			// 这里文件都没打开，所以不用关闭
			throw e;
		}catch(Exception e){
			// 这里完成清理
			// 多用一层try-catch包含
			try{
				in.close();
			}catch(IOException e2){
				System.out.println("in.close() unsuccessful");
			}
			throw e;// 重新抛出
		}finally{
			// 不要在这里执行清理操作
		}
	}
	public String getLine(){
		String s;
		try{
			s = in.readLine();
		}catch(IOException e){
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose(){
		try{
			in.close();
			System.out.println("dispose() successful");
		}catch(IOException e){
			throw new RuntimeException("in.close() failed");
		}
	}
}

/**
 * @Title InputFile.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��1��10��
 * @version 1.0
 */
package ch12;
import java.io.*;

/**
 * @ClassName InputFile
 * @Description ���漰������ʱ����������Ѷ������óɰ�ȫ�ĳ�ʼ״̬���������б�Ķ���������ļ��������ද��ֻ���ڶ���ʹ����ϲ����û�����
 * ���������������֮����ܵ�������������������׳����쳣����Щ������ΪҲ��Ͳ������������ˡ�
 * <p>��Ϊfinallyÿ�ζ���ִ��������룬�����������ִ�й����а�;���ϣ�Ҳ��ö����ĳЩ���ֻ�û�б�����������ȴҪ��finally�������ͻ��������
 * @author �����
 * @date 2019��1��10��
 * 
 */
public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception{
		try{
			in = new BufferedReader(new FileReader(fname));
			// ���������׳��쳣�Ĵ���
		}catch(FileNotFoundException e){
			System.out.println("Could not open " + fname);
			// �����ļ���û�򿪣����Բ��ùر�
			throw e;
		}catch(Exception e){
			// �����������
			// ����һ��try-catch����
			try{
				in.close();
			}catch(IOException e2){
				System.out.println("in.close() unsuccessful");
			}
			throw e;// �����׳�
		}finally{
			// ��Ҫ������ִ���������
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

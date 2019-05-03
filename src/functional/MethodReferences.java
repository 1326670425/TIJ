/**
 * @Title MethodReferences.java
 * @Package functional
 * @Description TODO
 * @author �����
 * @date 2019��5��3��
 * @version 1.0
 */
package functional;
import java.util.*;

interface Callable {// �ӵ�һ�����ӿڿ�ʼ
	void call(String s);
}

class Describe {
	void show(String msg) {// show��ǩ�����������ͺͷ������ͣ�����call��ǩ��
		System.out.println(msg);
	}
}

/**
 * @ClassName MethodReferences
 * @Description �������ã������������  �� :: �� ��������
 * @author �����
 * @date 2019��5��3��
 * 
 */
public class MethodReferences {
	static void hello(String name) {// Ҳ����call��ǩ��
		System.out.println("Hello, " + name);
	}
	static class Description {
		String about;
		Description(String desc) { about = desc; }
		void help(String msg) {// ��̬���еķǾ�̬����
			System.out.println(about + " " + msg);
		}
	}
	static class Helper {
		static void assist(String msg) {// ��̬���еľ�̬����
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		Describe d = new Describe();
		// ��Describe����ķ������ø�ֵ��Callable����ȻCallableû��show()������
		// ����show()�ķ���ǩ������call()�����ģ�����Java���������ĸ�ֵ
		Callable c = d :: show;
		// ͨ������call()������show()��Java��call()ӳ�䵽show()
		c.call("call()");
		
		// ��̬��������
		c = MethodReferences::hello;
		c.call("Bob");
		
		c = new Description("valuable")::help;
		c.call("information");
		
		c = Helper::assist;
		c.call("Help!");
	}
}

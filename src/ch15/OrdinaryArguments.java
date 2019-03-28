/**
 * @Title OrdinaryArguments.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

class OrdinarySetter{
	void set(Base base){
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter{
	void set(Derived derived){
		System.out.println("DerivedSetter.set(Derived)");
	}
}


/**
 * @ClassName OrdinaryArguments
 * @Description �ڷǷ��ʹ����У��������Ͳ������������ͷ����仯
 * @author �����
 * @date 2019��3��28��
 * 
 */
public class OrdinaryArguments {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		// ����set���ǺϷ��ģ����DerivedSetter.set()û�и���OrdinarySetter.set()���������������������
		// ������пɵã�DerivedSetter����������������˻���汾�Ծ��ǿ��õģ���˿���֤���������ع�
		ds.set(derived);
		ds.set(base);
	}
}

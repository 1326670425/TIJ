/**
 * @Title RestricedComparablePets.java
 * @Package ch15
 * @Description TODO
 * @author �����
 * @date 2019��3��28��
 * @version 1.0
 */
package ch15;

/**
 * @ClassName RestricedComparablePets
 * @Description Hamster˵���ٴ�ʵ��ComparablePet�е���ͬ�ӿ��ǿ��ܵģ�ֻҪ���Ǿ�ȷ��ͬ������������������
 * @author �����
 * @date 2019��3��28��
 * 
 */
class Hamster extends ComparablePet implements Comparable<ComparablePet>{
	public int compareTo(ComparablePet arg){ return 0; }
}

class Gecko extends ComparablePet{
	public int compareTo(ComparablePet arg){ return 0; }
}
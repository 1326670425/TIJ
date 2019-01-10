/**
 * @Title DynamicFields.java
 * @Package ch12
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年1月10日
 * @version 1.0
 */
package ch12;

import javax.management.RuntimeErrorException;

class DynamicFieldsException extends Exception{}

/**
 * @ClassName DynamicFields
 * @Description 异常链：Throwable子类可以在构造器中接收一个cause对象作为参数。这个cause就用来表示原始异常，
 * 这样通过把原始异常传递给新的异常，使得即使在当前位置创建并抛出了新的异常，也能通过这个异常链追踪到异常最初发生的地方。
 * 在Throwable子类中，只有Error、Exception、RuntimeException提供了带cause参数的构造器。如果要把其他类型的
 * 异常链接起来，则应该使用initCause()方法而不是构造器
 * @author 吴扬颉
 * @date 2019年1月10日
 * 
 */
public class DynamicFields {
	private Object[][] fields;
	public DynamicFields(int initialSize){
		fields = new Object[initialSize][2];
		for (int i = 0; i < initialSize; i++) {
			fields[i] = new Object[] {null, null};
		}
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(Object[] obj : fields){
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	private int hasField(String id){
		for (int i = 0; i < fields.length; i++) {
			if(id.equals(fields[i][0]))
				return i;
		}
		return -1;
	}
	private int getFieldNumber(String id) throws NoSuchFieldException{
		int fieldNum = hasField(id);
		if(fieldNum == -1)
			throw new NoSuchFieldException();
		return fieldNum;
	}
	private int makeField(String id){
		for (int i = 0; i < fields.length; i++) {
			if(fields[i][0] == null){
				fields[i][0] = id;
				return i;
			}
		}
		Object[][] tmp = new Object[fields.length + 1][2];
		for (int i = 0; i < fields.length; i++) {
			tmp[i] = fields[i];
		}
		for (int i = fields.length; i < tmp.length; i++) {
			tmp[i] = new Object[]{null, null};
		}
		fields = tmp;
		return makeField(id);
	}
	public Object getField(String id) throws NoSuchFieldException{
		return fields[getFieldNumber(id)][1];
	}
	public Object setField(String id, Object value) throws DynamicFieldsException{
		if(value == null){
			// 大多数异常类都没有带cause的构造器
			// 在这些类中，你必须使用initCause()
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if(fieldNumber == -1)
			fieldNumber = makeField(id);
		Object result = null;
		try{
			result = getField(id);//获取原来的值
		}catch(NoSuchFieldException e){
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	public static void main(String[] args) {
		DynamicFields df = new DynamicFields(3);
		System.out.println(df);
		try{
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			System.out.println(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 11);
			System.out.println("df: " + df);
			System.out.println("df.getField(\"d\"): " + df.getField("d"));
			Object field = df.setField("d", null);//异常
		}catch(NoSuchFieldException e){
			e.printStackTrace(System.out);
		}catch(DynamicFieldsException e){
			e.printStackTrace(System.out);
		}
	}
}

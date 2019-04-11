/**
 * @Title TableCreator.java
 * @Package ch20.database
 * @Description TODO
 * @author �����
 * @date 2019��4��8��
 * @version 1.0
 */
package ch20.database;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
/**
 * @ClassName TableCreator
 * @Description ע�⴦��������ȡһ�����ļ���������ϵ����ݿ�ע�⣬�������ڴ������ݿ��SQL����
 * @author �����
 * @date 2019��4��8��
 * 
 */
public class TableCreator {
	public static void main(String[] args) throws Exception{
		if(args.length < 1){
			System.out.println("arguments: annotated classes");
			System.exit(0);
		}
		for(String className : args){
			Class<?> cl = Class.forName(className);
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			if(dbTable == null){
				System.out.println("No DBTable annotations in class " + className);
				continue;
			}
			String tableName = dbTable.name();
			// �������Ϊ�գ�ʹ��������Ϊ����
			if(tableName.length() < 1)
				tableName = cl.getName().toUpperCase();
			List<String> columnDefs = new ArrayList<String>();
			for(Field field : cl.getDeclaredFields()){
				String columnName = null;
				Annotation[] anns = field.getAnnotations();
				if(anns.length < 1)
					continue; // û����
				if(anns[0] instanceof SQLInteger){
					SQLInteger sInt = (SQLInteger)anns[0];
					if(sInt.name().length() < 1)
						columnName = field.getName().toUpperCase();
					else
						columnName = sInt.name();
					columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
				}
				if(anns[0] instanceof SQLString){
					SQLString sString = (SQLString)anns[0];
					if(sString.name().length() < 1)
						columnName = field.getName().toUpperCase();
					else
						columnName = sString.name();
					columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" + getConstraints(sString.constraints()));
				}
				StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
				for(String columnDef : columnDefs){
					createCommand.append("\n     " + columnDef + ",");
				}
				String tableCreate = createCommand.substring(0, createCommand.length() - 1) + ");";
				System.out.println("Table Creation SQL for " + className + " is :\n" + tableCreate);
			}
		}
	}
	
	private static String getConstraints(Constraints con){
		String constraints = "";
		if(con.allowNull())
			constraints += "NOT NULL";
		if(con.primaryKey())
			constraints += " PRIMARY KEY";
		if(con.unique())
			constraints += " UNIQUE";
		return constraints;
	}
}
/**
 * @Title Member.java
 * @Package ch20.database
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20.database;

/**
 * @ClassName Member
 * @Description 注解使用测试
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
@DBTable(name = "MEMBER")
public class Member {
	// 30：设置列大小
	@SQLString(30) String firstName;
	@SQLString(50) String lastName;
	@SQLInteger Integer age;
	@SQLString(value = 30, constraints = @Constraints(primaryKey = true)) String handle;
	static int memberCount;
	public String getHandle(){ return handle; }
	public String getFirstName(){ return firstName; }
	public String getLastName(){ return lastName; }
	public String toString(){ return handle; }
	public Integer getAge(){ return age; }
}

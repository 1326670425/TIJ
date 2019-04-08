/**
 * @Title PasswordUtils.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import java.util.*;
/**
 * @ClassName PasswordUtils
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class PasswordUtils {
	@UseCase(id = 47, description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49, description = "New password can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prePasswords, String password){
		return !prePasswords.contains(password);
	}
}

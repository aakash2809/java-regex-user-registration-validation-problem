import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

	// METHOD TO VALIDATE FIRST NAME
	public boolean isValidFirstName(String fName) {

		// REGEX TO CHECK FIRST NAME.
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";

		// COMPILE REGEX PATTERN
		Pattern p = Pattern.compile(regex);

		// IF THE FIRST NAME IS EMPITY OR NULL
		// return false
		if (fName == null) {
			return false;
		}

		// Pattern CLASS CONTAINS matcher() METHOD
		// TO FIND MATCHING BETWEEN FIRST NAME
		// AND REGULAR EXPRESSION.
		Matcher m = p.matcher(fName);

		// RETURN true if THE fName
		// MATCHED WITH THE ReGex
		return m.matches();
	}

}

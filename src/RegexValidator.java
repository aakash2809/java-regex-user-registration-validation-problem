import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

	// METHOD TO VALIDATE FIRST NAME
	public boolean isValidFirstName(String fName) {

		// REGEX TO CHECK FIRST NAME.
		String fNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}$";

		// COMPILE REGEX PATTERN
		Pattern compiledFNamePattern = Pattern.compile(fNamePattern);

		// IF THE FIRST NAME IS EMPITY OR NULL
		// return false
		if (fName == null) {
			return false;
		}

		// Pattern CLASS CONTAINS matcher() METHOD
		// TO FIND MATCHING BETWEEN FIRST NAME
		// AND REGULAR EXPRESSION.
		Matcher matcherObj = compiledFNamePattern.matcher(fName);

		// RETURN true if THE fName
		// MATCHED WITH THE ReGex
		return matcherObj.matches();
	}

	// METHOD TO VALIDATE LAST NAME
	public boolean isValidLastName(String lName) {

		// REGEX TO CHECK LAST NAME.
		String lNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern compiledLNamePattern = Pattern.compile(lNamePattern);
		if (lName == null) {
			return false;
		}
		Matcher matcherObj = compiledLNamePattern.matcher(lName);
		return matcherObj.matches();
	}

	// METHOD TO VALIDATE EMAIL ID
	public boolean isValidEmail(String email) {

		// REGEX TO CHECK EMAIL ID
		String emailPattern = "^([A-Za-z\\d-_\\+]+)(\\.[A-Za-z\\d-_]+)?@([a-zA-Z\\d]+)\\.([a-zA-Z]{2,4})(\\.[A-Za-z]{2,4})?$";
		Pattern compiledEmailPattern = Pattern.compile(emailPattern);
		Matcher matcherObj = compiledEmailPattern.matcher(email);
		return matcherObj.matches();
	}

	// METHOD TO VALIDATE MOBILE NUMBER WITH COUNTRY CODE
	public boolean isValidMobileNumber(String mobileNumber) {

		// REGEX TO CHECK MOBILE NUMBER
		String mobileNumberPattern = "^(\\+?\\d{1,3})[ ]([0-9]{10})$";
		Pattern compiledmobileNumberPattern = Pattern.compile(mobileNumberPattern);
		Matcher matcherObj = compiledmobileNumberPattern.matcher(mobileNumber);
		return matcherObj.matches();
	}

	// METHOD TO VALIDATE PASSWORD FOR MINIMUM 8 CHARACTER
	// ALTEAST ONE CAPITAL CHARACTER
	// ATLEAST ONE NUMERIC NUMBER
	public boolean isValidPassword(String password) {

		// REGEX TO CHECK MOBILE NUMBER
		String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9!?.+-~!@#$%^&*_]{8,}$";
		Pattern compiledpaswordPattern = Pattern.compile(passwordPattern);
		Matcher matcherObj = compiledpaswordPattern.matcher(password);
		return matcherObj.matches();

	}

}

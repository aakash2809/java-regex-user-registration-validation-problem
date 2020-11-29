package com.UserResiserationProblem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

	// METHOD TO VALIDATE FIRST NAME
	public boolean isValidFirstName(String fName) {

		String fNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern compiledFNamePattern = Pattern.compile(fNamePattern);
		if (fName == null) {
			return false;
		}
		Matcher matcherObj = compiledFNamePattern.matcher(fName);
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
	// ATLEAST ONE SPECIAL CHARACTER
	public boolean isValidPassword(String password) {

		// REGEX TO CHECK MOBILE NUMBER
		String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_])[a-zA-Z0-9\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_]{8,}$";
		Pattern compiledpaswordPattern = Pattern.compile(passwordPattern);
		Matcher matcherObj = compiledpaswordPattern.matcher(password);
		return matcherObj.matches();

	}

}

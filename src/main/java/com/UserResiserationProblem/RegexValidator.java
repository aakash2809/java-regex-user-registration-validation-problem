package com.UserResiserationProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

	// METHOD TO VALIDATE FIRST NAME
	public boolean isValidFirstName(String fName) throws UserRegistrationException {

		String fNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern compiledFNamePattern = Pattern.compile(fNamePattern);
		if (fName == null) {
			return false;
		}
		Matcher matcherObj = compiledFNamePattern.matcher(fName);

		if (matcherObj.matches()) {
			System.out.println("valid First name");
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid first name");
		}

	}

	// METHOD TO VALIDATE LAST NAME
	public boolean isValidLastName(String lName) throws UserRegistrationException {

		String lNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern compiledLNamePattern = Pattern.compile(lNamePattern);
		if (lName == null) {
			return false;
		}
		Matcher matcherObj = compiledLNamePattern.matcher(lName);
		if (matcherObj.matches()) {
			System.out.println("valid Last name");
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid Last name");
		}
		 
		 
	}

	// METHOD TO VALIDATE EMAIL ID
	public boolean isValidEmail(String email) throws UserRegistrationException {

		String emailPattern = "^([A-Za-z\\d-_\\+]+)(\\.[A-Za-z\\d-_]+)?@([a-zA-Z\\d]+)\\.([a-zA-Z]{2,4})(\\.[A-Za-z]{2,4})?$";
		Pattern compiledEmailPattern = Pattern.compile(emailPattern);
		Matcher matcherObj = compiledEmailPattern.matcher(email);
		if (matcherObj.matches()) {
			System.out.println("valid Email Id");
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid Email Id");
		}
		 
	}

	// METHOD TO VALIDATE MOBILE NUMBER WITH COUNTRY CODE
	public boolean isValidMobileNumber(String mobileNumber) throws UserRegistrationException {

		String mobileNumberPattern = "^(\\+?\\d{1,3})[ ]([0-9]{10})$";
		Pattern compiledmobileNumberPattern = Pattern.compile(mobileNumberPattern);
		Matcher matcherObj = compiledmobileNumberPattern.matcher(mobileNumber);
		if (matcherObj.matches()) {
			System.out.println("valid Mobile Number");
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid Mobile No");
		}
	}

	// METHOD TO VALIDATE PASSWORD 
	public boolean isValidPassword(String password) throws UserRegistrationException {

		String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_])[a-zA-Z0-9\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_]{8,}$";
		Pattern compiledpaswordPattern = Pattern.compile(passwordPattern);
		Matcher matcherObj = compiledpaswordPattern.matcher(password);
		if (matcherObj.matches()) {
			System.out.println("valid password");
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid [passwprd");
		}

	}

}

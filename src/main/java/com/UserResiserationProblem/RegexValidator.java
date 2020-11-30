package com.UserResiserationProblem;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

	// METHOD TO VALIDATE FIRST NAME
	public boolean isValidFirstName(String fName) throws UserRegistrationException {

		Predicate<String> validCheck = str -> str.matches("^[A-Z]{1}[a-zA-Z]{2,}$");
		if(validCheck.test(fName)) {
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid first name");
		}

	}

	// METHOD TO VALIDATE LAST NAME
	public boolean isValidLastName(String lName) throws UserRegistrationException {

		Predicate<String> validCheck = str -> str.matches("^[A-Z]{1}[a-zA-Z]{2,}$");
		if(validCheck.test(lName)) {
			return true;
		}else {
			throw new UserRegistrationException("Please enter a valid Last name");
		}
		 
	}

	// METHOD TO VALIDATE EMAIL ID
	public boolean isValidEmail(String email) throws UserRegistrationException {

		Predicate<String> validCheck = str -> str.matches( "^([A-Za-z\\d-_\\+]+)(\\.[A-Za-z\\d-_]+)?@([a-zA-Z\\d]+)\\.([a-zA-Z]{2,4})(\\.[A-Za-z]{2,4})?$");
		if(validCheck.test(email)) {
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid Email Id");
		}
		 
	}

	// METHOD TO VALIDATE MOBILE NUMBER WITH COUNTRY CODE
	public boolean isValidMobileNumber(String mobileNumber) throws UserRegistrationException {

		Predicate<String> validCheck = str -> str.matches("^(\\+?\\d{1,3})[ ]([0-9]{10})$");
		if(validCheck.test(mobileNumber)) {
			return true;
		}
		 else {
			throw new UserRegistrationException("Please enter a valid Mobile No");
		}
	}

	// METHOD TO VALIDATE PASSWORD 
	public boolean isValidPassword(String password) throws UserRegistrationException {

		Predicate<String> validCheck = str -> str.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_])[a-zA-Z0-9\\~\\?\\.\\+\\-\\~\\!\\@\\#\\$\\%\\^\\&\\*\\_]{8,}$");
		if(validCheck.test(password)) {
			return true;
		} else {
			throw new UserRegistrationException("Please enter a valid passwprd");
		}

	}

}

package com.UserResiserationProblem;

import org.junit.Assert;
import org.junit.Test;

public class RegexValidatorTest {

	RegexValidator regexValidator = new RegexValidator();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

		Assert.assertTrue(regexValidator.isValidFirstName("Raj"));
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

		Assert.assertTrue(regexValidator.isValidLastName("Jaiswal"));
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

		Assert.assertTrue(regexValidator.isValidEmail("aakashrajak@gmail.com"));

	}


	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

		Assert.assertTrue(regexValidator.isValidMobileNumber("91 9923456789"));
	}


	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() throws UserRegistrationException {

		Assert.assertTrue(regexValidator.isValidPassword("Aakash@123"));
	}

}

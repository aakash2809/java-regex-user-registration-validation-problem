package com.UserResiserationProblem;

import org.junit.Assert;
import org.junit.Test;

public class RegexValidatorTest {

	RegexValidator regexValidator = new RegexValidator();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {

		Assert.assertTrue(regexValidator.isValidFirstName("Raj"));
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {

		Assert.assertFalse(regexValidator.isValidFirstName("Ra"));
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {

		Assert.assertTrue(regexValidator.isValidLastName("Jaiswal"));
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {

		Assert.assertFalse(regexValidator.isValidLastName("jaiswal"));
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {

		Assert.assertTrue(regexValidator.isValidEmail("aakashrajak@gmail.com"));

	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {

		Assert.assertFalse(regexValidator.isValidEmail("abc@.com.my"));
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {

		Assert.assertTrue(regexValidator.isValidMobileNumber("91 9923456789"));
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {

		Assert.assertFalse(regexValidator.isValidMobileNumber("9825236"));
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {

		Assert.assertTrue(regexValidator.isValidPassword("Aakash@123"));
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {

		Assert.assertFalse(regexValidator.isValidPassword("aakash@123"));
	}
}

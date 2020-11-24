public class UserRegistrationValidatorMain {

	public static void main(String[] args) {

		// INDEX VARIABLES FOR ITTERATION
		int index1 = 0;
		int index2 = 0;

		// ASSIGING SOME VALID SAMPLES
		String validEmailSample[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

		// ASSIGING SOME VALID SAMPLES
		String invalidEmailSample[] = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		RegexValidator regexValidator = new RegexValidator();

		System.out.println("              Welcome to User Registration Program                   ");
		System.out.println("---------------------------------------------------------------------");

		System.out.println("------------------First name validation results----------------------");

		// TEST CASES FOR FIRST NAME
		System.out.println(regexValidator.isValidFirstName("Rat")); // true
		System.out.println(regexValidator.isValidFirstName("Ra")); // false
		System.out.println(regexValidator.isValidFirstName("rat")); // false

		System.out.println("------------------Last name validation results----------------------");

		// TEST CASES FOR LAST NAME
		System.out.println(regexValidator.isValidLastName("RaJ")); // true
		System.out.println(regexValidator.isValidLastName("Ra")); // false
		System.out.println(regexValidator.isValidLastName("raj")); // false

		System.out.println("------------------ Email validation results----------------------");
		// VAILDATION OF EMAIL BY PROVIDING SAMPLE INPUT
		System.out.println("Valid email list results");
		// 1 .ALL SHOULD PRINT TRUE
		while (index1 < validEmailSample.length) {
			System.out.println(regexValidator.isValidEmail(validEmailSample[index1]));
			index1++;
		}

		System.out.println("Invalid email list results");
		// 2.ALL SHOULD PRINT FALSE
		while (index2 < invalidEmailSample.length) {
			System.out.println(regexValidator.isValidEmail(invalidEmailSample[index2]));
			index2++;
		}

	}

}

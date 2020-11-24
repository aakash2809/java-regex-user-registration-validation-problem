public class UserRegistrationValidatorMain {

	public static void main(String[] args) {

		RegexValidator regexValidator = new RegexValidator();

		System.out.println("              Welcome to User Registration Program                   ");
		System.out.println("---------------------------------------------------------------------");

		// TEST CASES FOR FIRST NAME
		System.out.println(regexValidator.isValidFirstName("Rat")); // true
		System.out.println(regexValidator.isValidFirstName("Ra")); // false
		System.out.println(regexValidator.isValidFirstName("rat")); // false


	}

}

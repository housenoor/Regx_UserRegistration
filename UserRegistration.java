package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	// UseCase1
	/*
	 * Declaring Method TO Validate FirstName
	 */
	public boolean FirstNameValidation(String FirstName) {
		// First Name Matching With The Pattern And Stored In Validation
		boolean Validation = Pattern.matches("^[A-Z][a-z]{2,}$", FirstName);
		// Validation Is Boolean Type True Or False
		if (Validation) {
			// If Validation Is True Print The Valid Name
			System.out.println("The entered FirstName is Valid");
		} else {
			// If Validation Is False Print The Name Is Invalid
			System.out.println("Invalid Name ..\n Please Enter valid name");
		}
		return Validation; // Return Validation
	}

	// UseCase2
	/*
	 * method for validating the lastname using Regex
	 */
	public boolean LastNameValidation(String LastName) {
		boolean Validation = Pattern.matches("^[A-Z]{1}[a-b]{2,}$", LastName);
		// Validation Is Boolean Type True Or False
		if (Validation) {
			// If Validation Is True Print The Valid Name
			System.out.println("The Entered LastName is Valid");
		} else {
			// If Validation Is False Print The Name Is Invalid
			System.out.println("Invalid Name .. \n Enter valid name");
		}
		return Validation;// Return Validation
	}

	// UseCase3
	/*
	 * Declaring Method TO Validate Email Delcaring Mandatory 3 parts and 2 optional
	 * parts of email in Regex Pattern
	 */
	public boolean EmailValidation(String Email) {
		// email Matching With The Pattern And Stored In Validation
		boolean Validation = Pattern.matches(
				"^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$", Email);
		// Validation Is Boolean Type True Or False
		if (Validation) {
			System.out.println("Entered Email is Valid");
		} else {
			System.out.println("Invalid Email..  Please Enter valid Email");
		}
		return Validation;// Return Validation
	}

	// UseCase4
	/*
	 * Declaring Method TO Validate Phone Number
	 */
	public boolean ValidatePhoneNum(String PhoneNumber) {
		// Phone Number Matching With The Pattern And Stored In Validation
		boolean Validation = Pattern.matches("^\\d{10}$", PhoneNumber);
		// Validation Is Boolean Type True Or False
		if (Validation) {
			System.out.println("Entered Mobile Number is Valid");
		} else {
			System.out.println("Invalid  Mobile Number . \n Enter valid Phone  Number");
		}
		return Validation;// Return Validation
	}

	/*
	 * Declaring Method TO Validate Password with min. 8 characters and One
	 * UpperCase validate the Password with numeric value validate the password with
	 * Special character
	 */
	public boolean PasswordValidation(String Password) {
		// Password Matching With The Pattern And Stored In Validation
		boolean Validation = Pattern.matches("^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$", Password);
		// Validation Is Boolean Type True Or False
		if (Validation) {
			System.out.println("Entered Password is Valid");
		} else {
			System.out.println("Invalid Password... Enter valid Password");
		}
		return Validation; // Return Validation
	}
}
package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	// Declaring Method TO Validate FirstName
	public boolean FirstNameValidation(String FirstName) {
		// First Name Matching With The Pattern And Stored In Validation
		boolean Validation = Pattern.matches("^[A-Z][a-z]{2,}$", FirstName);
		// Validation Is Boolean Type True Or False
		if (Validation) {// If Validation Is True Print The Valid Name
			System.out.println("The entered FirstName is Valid");
		} else {// If Validation Is False Print The Name Is Invalid
			System.out.println("Invalid Name ..\n Please Enter valid name");
		}
		return Validation; // Return Validation
	}
}
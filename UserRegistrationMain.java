package com.bl.userregistration;

public class UserRegistrationMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Registration System");
		// Creating Variable With Using Of UserRegistration Class
		UserRegistration userRegistration = new UserRegistration();
		// Here Calling FirstName Method Storing The Result In Result
		boolean firstName = userRegistration.FirstNameValidation("Srikanth");
		System.out.println(firstName);// Printing Result
	}
}
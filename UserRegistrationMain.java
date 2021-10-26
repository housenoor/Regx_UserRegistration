package com.bl.userregistration;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        //Creating Variable With Using Of UserRegistration Class
        UserRegistration userRegistration = new UserRegistration();
        //Here Calling FirstName Method Storing The Result In Result
        boolean firstName = userRegistration.FirstNameValidation("Cahry");
        System.out.println(firstName);//Printing Result
        //Here Calling Validate FirstName Method Storing The Result In Result
        boolean lastName = userRegistration.FirstNameValidation("Alige");
        System.out.println(lastName);//Printing Result
        //Here Calling Validate Email Method Storing The Result In Result
        boolean email = userRegistration.EmailValidation("srikanthh99@4gmail.com"); //declaring the email using Boolean
        System.out.println(email);//Printing Result
        //Here Calling Validate PhoneNumber Method Storing The Result In Result
        boolean PhoneNo = userRegistration.ValidatePhoneNum("7569621466");
        System.out.println(PhoneNo);//Printing Result
        //validating the password and prints the result
        boolean Password = userRegistration.PasswordValidation("bridgelabz@123");
        System.out.println(Password);
    }
}
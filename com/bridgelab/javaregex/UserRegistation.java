package com.bridgelab.javaregex;

import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class UserRegistation {

	// Valiadate First Name
	public boolean validateFirstName(String str) {
		String firstName = str;
		String regex = "^[A-Z]{1}[a-z]{2,15}$";
		Pattern p = Pattern.compile(regex);

		if (firstName == null) {
			return false;
		}
		Matcher m = p.matcher(firstName);
		return m.matches();
	}

//Validate Last Name
	public boolean validateLasttName(String str) {
		String lastName = str;
		String regex = "^[A-Z]{1}[a-z]{2,15}$";
		Pattern p = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher m = p.matcher(lastName);
		return m.matches();
	}

//Validate Email Address
	public boolean validateEmail(String str) {
		String emailAdd = str;
		// String regex = "^[A-Za-z0-9+.]+@[a-zA-Z0-9.]+[a-zA-Z]{2,6}$";
		String regex = "^[A-Za-z+.]+@[a-zA-Z.]+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(regex);

		if (emailAdd == null) {
			return false;
		}
		Matcher m = p.matcher(emailAdd);
		return m.matches();
	}

//Validate Phone Number Giving Space
	public boolean phoneNumber(String str) {
		String phoneNumber = str;
		String regex = "(91)[: :][9][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		if (phoneNumber == null) {
			return false;
		}
		Matcher m = p.matcher(phoneNumber);
		return m.matches();
	}

   //Passwword Validation
	public boolean passwordValidation(String str) {
		String password = str;
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public boolean emailValidation(String str) {
		String email = str;
		String regex= "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		boolean result=m.matches();
		if(result==true) {
			System.out.println("Email is Valid::"+email);
		}else {
			System.out.println("Email is Valid::"+email);
		}
		return m.matches();
	}
}

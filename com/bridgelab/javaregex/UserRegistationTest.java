package com.bridgelab.javaregex;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class UserRegistationTest {
	UserRegistation user = new UserRegistation();
	Scanner sc = new Scanner(System.in);
	// Valiadate First Name
	@Test
	public void validateFirstNameTest() {
		System.out.println("Enter First Name::");
		String str = sc.next();
		boolean result = user.validateFirstName(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
	// Validate Last Name
	@Test
	public void validateLasttNameTest() {
		System.out.println("Enter Last Name::");
		String str = sc.next();
		boolean result = user.validateLasttName(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
	// Validate Email
	@Test
	public void validaeEmailTest() {
		System.out.println("Enter Email ID::");
		String str = sc.next();
		boolean result = user.validateEmail(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
	// Validate Phone Number Giving Space
	@Test
	public void phoneNumberTest() {
		System.out.println("Enter Phone Number With Country Code::");
		String str = sc.nextLine();
		boolean result = user.phoneNumber(str);
		System.out.println("Output::" + result);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
	//Validate Password
	@Test
	public void passwordTest() {
		System.out.println("Enter password minimum 8 Digit::");
		String str = sc.nextLine();
		boolean result = user.passwordValidation(str);
		boolean excepted = true;
		assertEquals(excepted, result);
	}
}

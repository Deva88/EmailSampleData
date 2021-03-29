package com.emailsample;

import java.util.*;
import java.util.regex.*;

/**
 * *Validate Email user need to enter a valid Email ID valid or not.
 * 
 */
public class EmailSampleData {

	public static boolean email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.next();
		if (Pattern.matches(
				"[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+",
				email)) {

			System.out.println("Email Id valid");
			return true;
		} else {
			System.out.println("Email Id invalid");
			return email();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		email();
	}

}

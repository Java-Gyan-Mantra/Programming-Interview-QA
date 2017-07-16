package com.symantec.interview.questions;

/**
 * @author basanta.kumar.hota Q2.Write a program to reverse of a string using
 *         recursion method. [Hint]Don't use inbuilt API methods/functions
 *         [Example] "symantec"->"cetnamys"
 */
public class ReverseString {
	String reverse = "";

	public static String reverseString(String str) {
		String reverse = "";
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

	// using ternary operator
	public static String reverseString2(String str) {
		String reverse = "";
		return (str.length() == 1) ? str : reverse
				+ str.charAt(str.length() - 1)
				+ reverseString(str.substring(0, str.length() - 1));

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Basanta"));
		System.out.println(reverseString2("Basanta"));
	}
}

package com.symantec.interview.questions;

/**
 * @author basanta.kumar.hota Q9.Write a program to check if the given
 *         string/char array is numeric. [Example]
 *         "abcde"-false/"12345"-true/"abcS#12"-false
 */
public class NumericValidator {

	public static boolean isNumeric(String input) {
		return input.matches("^[0-9]*$") ? true : false;
	}

	public static void main(String[] args) {
		System.out.println("is Numeric :" + isNumeric("12345"));
		System.out.println("is Numeric :" + isNumeric("abcde"));
		System.out.println("is Numeric :" + isNumeric("abc123"));
	}
}

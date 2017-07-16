package com.symantec.interview.questions;

import java.util.Arrays;

/**
 * @author basanta.kumar.hota
 *
 *         Q8.Find if two strings are anagrams.Use your own words,[E.g one and
 *         eon are anagrams -words formed by rearranging]
 */
public class CheckAnagram {

	public static boolean check(String input1, String input2) {
		boolean flag = false;
		String s1 = input1.trim();
		String s2 = input2.trim();
		if (input1.length() != input2.length()) {
			return flag;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			flag = Arrays.equals(ch1, ch2);
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("is anagram :" + check("one", "eon"));
	}
}

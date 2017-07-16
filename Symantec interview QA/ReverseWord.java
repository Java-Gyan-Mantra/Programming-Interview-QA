package com.symantec.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author basanta.kumar.hota Q3.Write code to reverse a sentence with whole
 *         words.Please refrain from using inbuilt programming constructors
 *         using string manipulations. [Example]
 *         " I love India"->"India love I".
 */
public class ReverseWord {

	public static String reverse(String input) {
		List<String> words = new ArrayList<>();
		for (String word : input.split(" ")) {
			words.add(word);
		}
		Collections.reverse(words);
		return String.join(" ", words);
	}

	public static void main(String[] args) {
		System.out.println(reverse("I Love India"));
	}
}

package com.symantec.interview.questions;

/**
 * @author basanta.kumar.hota Q5.Find the largest number in an array of 20
 *         elements.
 */
public class FindLargestElement {

	public static int findLargrst(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length - 1; i++) {
			if (max < input[i]) {
				max = input[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out
				.println(findLargrst(new int[] { 1, 12, 34, 21, 23, 25, 11 }));
	}
}

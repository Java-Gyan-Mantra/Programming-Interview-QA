package com.symantec.interview.questions;

public class MissingFromArray {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 6 };
		int n = input.length - 1;
		int total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			total = total - input[i];
		}
		System.out.println(total);
	}
}

package com.symantec.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author basanta.kumar.hota
 * 
 *         Q1.Given the array of integers containing equal numbers of even and
 *         odd numbers,rearrange the array such that the even number is at even
 *         places and odd number is at odd places.[numbers need not to be
 *         sorted] [example] Input:[4 5 7 8 1 12 9] Output [4 5 8 7 12 1 9]
 *
 */
public class ArrayFormatter {

	public static int[] getFormat(int[] input) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i] % 2 == 0) {
				even.add(input[i]);
			} else {
				odd.add(input[i]);
			}
		}
		return join(even, odd);
	}

	// Swapping Array to get Format
	private static int[] join(List<Integer> a, List<Integer> b) {
		int size = 0;
		size = a.size() + b.size();
		int[] result = new int[size];
		int j = 0;
		int i = 0;
		int k = 0;
		for (k = 0; k < size - 1; k++) {
			result[k] = a.get(i);
			result[k + 1] = b.get(j);
			k++;
			i++;
			j++;
		}
		if (a.size() > b.size()) {
			result[k] = a.get(i);
		} else {
			result[k] = b.get(j);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = { 4, 5, 7, 8, 1, 12, 9 };
		System.out.println(Arrays.toString(getFormat(input)));
	}

}

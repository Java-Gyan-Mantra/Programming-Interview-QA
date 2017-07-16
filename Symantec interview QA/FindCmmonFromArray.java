package com.symantec.interview.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author basanta.kumar.hota Q10.Write a program to identify common numbers
 *         between two given arrays. [Example] Array1[2,3,12,34,45,12,11]
 *         Array2[3,55,11,33,44,13,15]
 */
public class FindCmmonFromArray {

	public static List<Integer> find(int[] array1, int[] array2) {
		List<Integer> common = new ArrayList<>();
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array2.length - 1; j++) {
				if (array1[i] == array2[j]) {
					common.add(array1[i]);
				}
			}
		}
		return common;
	}

	public static void main(String[] args) {
		System.out.println(find(new int[] { 2, 3, 12, 34, 45, 12, 11 },
				new int[] { 3, 55, 11, 33, 44, 13, 15 }));
		// 3,11
	}
}

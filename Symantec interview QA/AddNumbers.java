package com.symantec.interview.questions;

/**
 * @author basanta.kumar.hota
 *
 *         Q4.Write a program to add 2 numbers without using arithmetic "+"
 *         operator.
 */
public class AddNumbers {

	public static int add(int x, int y) {
		return (y == 0) ? x : add(x ^ y, (x & y) << 1);
	}

	public static void main(String[] args) {
		System.out.println(add(10, 11));
	}
}

package com.projecteuler.solutions;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author Xander Cera
 * 
 */
public class Problem2 {

	public static void main(String[] args) {
		long pipe[] = { 1, 2 };
		long nextNum = 0;
		long sum = 2;

		while (nextNum < 4000000) {
			nextNum = pipe[0] + pipe[1];
			if (nextNum % 2 == 0) {
				sum = sum + nextNum;
			}
			pipe[0] = pipe[1];
			pipe[1] = nextNum;
		}
		System.out.println(sum);
	}
}

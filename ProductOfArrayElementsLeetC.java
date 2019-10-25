package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.List;
//Need optimized solution

public class ProductOfArrayElementsLeetC {

	public static void main(String[] args) {

		ProductOfArrayElementsLeetC prod = new ProductOfArrayElementsLeetC();
		int[] input = { 1, 2, 3, 4 };

		List<Integer> output = new ArrayList<Integer>();
		output = prod.find(input);
		System.out.println("Product returned: " + output);
	}

	private List<Integer> find(int[] input) {
		int product = 0;
		List<Integer> myoutput = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			int no = findproduct(input, i);
			myoutput.add(no);
		}
		return myoutput;

	}

	private int findproduct(int[] input, int i) {
		int prod = 1;
		for (int j = 0; j < input.length; j++) {

			if ((i == j) || (i == 0)) {

				continue;
			} else {

				prod = prod * input[j];
			}
		}
		return prod;

	}

}

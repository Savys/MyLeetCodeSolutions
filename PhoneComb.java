package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneComb {
	List<String>			output	= new ArrayList<String>();
	Map<String, String>	phone		= new HashMap<String, String>();

	public static void main(String[] args) {
		PhoneComb find = new PhoneComb();
		String digits = "23";
		List<String>	 result=find.letterCombinations(digits);
		System.out.println("result:" +result);

	}

	private List<String>	 letterCombinations(String digits) {
		phone.put("2", "abc");
		phone.put("3", "def");
		phone.put("4", "ghi");
		phone.put("5", "jkl");
		phone.put("6", "mno");
		phone.put("7", "pqrs");
		phone.put("8", "tuv");
		phone.put("9", "wxyz");
		if (digits.length() != 0) {
			backTrack("", digits);
		}
return output;
	}

	private void backTrack(String combination, String next_digits) {
		if (next_digits.length() == 0) {
			output.add(combination);
		} else {
			String digit = next_digits.substring(0, 1);
			String letters = phone.get(digit);

			for (int i = 0; i < letters.length(); i++) {
				String letter = phone.get(digit).substring(i, i + 1);
				backTrack(combination + letter, next_digits.substring(1));
			}
		}
	}

}

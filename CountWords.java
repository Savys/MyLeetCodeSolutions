package com.savitha.leetcode;

public class CountWords {
	int count = 0;
	int result;

	public void count(String input, String word) {
		int index1 = 0;
		int index2 = 0;
		int s=0,e=0;
		int e1=word.length();
		
    	for (int i = 0; i <= input.length()-e1; i++) {
			 result=iswordpresent(i, i+e1, input, word);
		}
		System.out.println("result:"+result);
	}

	public int iswordpresent(int start, int end, String input, String word) {
		String substring = input.substring(start, end);
		System.out.println("substring:" + substring);
      if(substring.equals(word))
      {
      	    count++;
      }
		return count;
	}

	public static void main(String[] args) {
		CountWords words = new CountWords();
		String s1 = "ABCDBALLXYZBALL";
		String s2 = "BALL";
		words.count(s1, s2);
	}

}

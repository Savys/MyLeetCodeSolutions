package com.savitha.leetcode;

public class RevStringRec344LeetCode {

	public static void main(String[] args) {
		RevStringRec344LeetCode revEng=new RevStringRec344LeetCode();
		String s="hello";
		String output=revEng.reverseRecursive(s);
		System.out.println("Revresed String:"+output);

	}

	private String reverseRecursive(String str) {
	 if((str ==null) ||(str.length()<=1))
	 {
		 return str;
	 }
	 return reverseRecursive(str.substring(1))+str.charAt(0);
	 /*reverse("Hello")
	 (reverse("ello")) + "H"
	 ((reverse("llo")) + "e") + "H"
	 (((reverse("lo")) + "l") + "e") + "H"
	 ((((reverse("o")) + "l") + "l") + "e") + "H"
	 (((("o") + "l") + "l") + "e") + "H"
	 "olleH"*/
		
	}

}

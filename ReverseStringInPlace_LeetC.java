package com.savitha.leetcode;

import java.nio.file.attribute.AclEntry.Builder;

public class ReverseStringInPlace_LeetC {
	public static void main(String args[])
	{
		ReverseStringInPlace_LeetC revEngine=new ReverseStringInPlace_LeetC();
		String s1="12345";
		String output=revEngine.inPlaceReverse(s1);
		System.out.println(output);
		
	}

	private String inPlaceReverse(String s1) {
	 StringBuilder sb=new StringBuilder(s1);
	 int length=sb.length();
	 for(int i=0;i<length/2;i++)
	 {
		 char current=sb.charAt(i);
		 int end=length-i-1;
		 sb.setCharAt(i,   sb.charAt(end));
		 sb.setCharAt(end, current);
	 }
		return sb.toString();
	}

}

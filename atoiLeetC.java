package com.savitha.leetcode;

public class atoiLeetC {

	public static void main(String[] args) {
		String s = "-42";
		atoiLeetC convertEng = new atoiLeetC();
		
		int output=convertEng.Stringtointeger(s);
		System.out.println("output:" + output);
	}

	public int Stringtointeger(String input) {
		char[] charInput = input.toCharArray();
		int j=0;
		if(charInput[0]=='-')
		{
			j=j+1;
		}
		int result = 0;
		while(j<charInput.length)
		{
			int no = (charInput[j] - '0');
			result = (result * 10) + no;
			j++;
		}
		//System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
		//System.out.println("Integer.MIN_value:"+Integer.MIN_VALUE);
		if(result<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
	return result;
	}
}

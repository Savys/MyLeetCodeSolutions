package com.savitha.leetcode;

public class strStrLeetC {

	public static void main(String[] args) {
		strStrLeetC convEngine = new strStrLeetC();
		/*String haystack = "hello";
		String needle = "ll";*/
		String haystack = "aaaaa";
		String needle = "bba";

		int out=convEngine.findindex(haystack, needle);
		System.out.println("out:"+out);
	}

	public int findindex(String hay, String nee) {

		int nLen=nee.length(),output=0;	
		for(int i=0;i<hay.length()-nLen;i++)
		{
			output=findpos(i,i+nLen,hay,nee);

		}
		return output;
	}
	public int findpos(int start,int end,String input, String txt)
	{
		String word = input.substring(start,end);
		//System.out.println("word: " +word);
		if(word.equals(txt))
			return start;

		return -1;
	}
}

package com.savitha.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar387Leet {

	public static void main(String[] args) {
		NonRepeatingChar387Leet findeng =new NonRepeatingChar387Leet();
		String s="loveleetcode";
		int pos=findeng.nonRepChar(s);
     System.out.println("Pos:"+pos);
	}

	private int nonRepChar(String s) {
	 Map<Character,Integer> hmap=new HashMap<Character,Integer>();
	 int len=s.length();
	 for(int i=0;i<len;i++)
	 {
		 char c=s.charAt(i);
		 if(hmap.containsKey(c))
		 {
			 hmap.put(c, hmap.get(c)+1);
		 
		 }
		 else
			 hmap.put(c, 1);
	 }
	 for(int j=0;j<len;j++)
	 {
		 if(hmap.get(s.charAt(j))==1)
		 {
			 return j;
		 }
			 
	 }
	return -1;
		
	}

}

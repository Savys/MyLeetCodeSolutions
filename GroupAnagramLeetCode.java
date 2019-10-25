package com.savitha.leetcode;

import java.util.ArrayList;
//Description: https://leetcode.com/problems/group-anagrams/-check for output
//https://leetcode.com/problems/group-anagrams/  49
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramLeetCode {

  public static void main(String[] args) {
    GroupAnagramLeetCode group= new GroupAnagramLeetCode();
    String[] s= {"eat","tea","tan","ate","nat","bat"}; 
    GroupAnagramLeetCode engine=new GroupAnagramLeetCode();
    List<List<String>>result=engine.groupAnagram(s);
    System.out.print(Arrays.toString(result.toArray()));
    //result.forEach(t->System.out.println(t + " "));
    
  }

private List<List<String>> groupAnagram(String[] strs) {
	List<List<String>>result =new ArrayList<>();
	Map<String,List<String>> map=new HashMap<String,List<String>>();
	for(String str:strs)
	{
		char[] chArr=str.toCharArray();
		Arrays.sort(chArr);
		String key=new String(chArr);
		
		if(map.containsKey(key))
		{
			map.get(key).add(str);
		}
		else
		{
			List<String> strList=new ArrayList<String>();
			strList.add(str);
			map.put(key, strList);
		}
		
		
	}
	result.addAll(map.values());
	return result;
	
}




  
  
}

package com.savitha.leetcode;
import java.util.HashMap;
import java.util.Map;

public class findMajorityElement {
	//Check for test case with 
	public static void main(String[] args) {
		//int[] input = { 3, 2, 3 };
		int[] input= {2,2,1,1,1,2,2};
		findMajorityElement find = new findMajorityElement();
		int output=find.majority(input);
		System.out.println("Maj element:"+output);
	}

	public int majority(int[] iArray) {
		int z = iArray.length / 2;
		Map<Integer, Integer> hmap = new HashMap<>();
		for (int y : iArray) {
			if (hmap.containsKey(y) && hmap.get(y)+1>z) {
				return y;
			} else
				
			hmap.put(y, hmap.getOrDefault(y, 0)+1);
		}
		return -1;
	}
}

package com.savitha.leetcode;
import java.util.Arrays;
//https://leetcode.com/problems/plus-one Easy 
/*
 * Test Cases :[1,2,3] -->[1,2,4]
 * [4,3,2,1]-> [4,3,2,2]
 * [1,9,9] >[2,0,0]
 * [9,9,9] ->[1,0,0,0]
 * 
 * */
public class PlusOne_LeetCode {

	public static void main(String[] args) {
		PlusOne_LeetCode plusOne=new PlusOne_LeetCode();
		int[] input= {9,0,9};
		int[]output=plusOne.plusOne(input);
		System.out.println(Arrays.toString(output));

		}
	public int[] plusOne(int[] digits) {
      
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
}
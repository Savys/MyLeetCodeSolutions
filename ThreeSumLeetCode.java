package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSumLeetCode {
  /*
  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find 
      all unique triplets in the array which gives the sum of zero.
   Given array nums = [-1, 0, 1, 2, -1, -4],
   */
  
  public static void main(String[] args) {
    int [] arr= {-1,0,1,2,-1,-4};
findThreeSum(arr);

  }

  private static ArrayList<ArrayList<Integer>> findThreeSum(int[] num) {
    final int length=num.length;
    ArrayList<ArrayList<Integer>>result =new ArrayList<ArrayList<Integer>>();
    Map<Integer,int[]> hashMap=new HashMap<Integer,int[]>();
    
    if(length<3)
      return result;
    
    Arrays.sort(num);
    for(int i=0;i<num.length-2;i++)
    {
      for(int j=i+1;j<num.length-1;j++)
      {
        for(int k=j+1;k<num.length;k++)
        {
          int a=num[i];
          int b=num[j];
          int c=num[k];
          if((a+b+c) ==0)
          {
            //add it to list -->Needs further work/refinement
          }
              
          
        }
      }
    }
    return result;
      
    

    
    
    
    
  }

}

package com.savitha.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesLeetCode {
  /*
   * Given a sorted array nums, remove the duplicates in-place such that each element 
   *  appear only once and return the new length.
   * */

  public static void main(String[] args) {

    RemoveDuplicatesLeetCode obj = new RemoveDuplicatesLeetCode();
    int[] m= {0,0,1,1,1,2,2,3,3,4};
    //int[] m= {1,1,2};
    int count=obj.removeDuplicatesAndCount(m);
    System.out.println("count:"+count);
    int[] a=obj.removeDuplicates2(m);
    for(int num:a)
      System.out.println(num);
  }

  private int[] removeDuplicates2(int[] a) {
    int i = 1;
    while (i < a.length) {
      if (a[i] == a[i - 1]) {
        System.arraycopy(a, i + 1, a, i, a.length - i - 1);
        //System.arraycopy(source_array,source_pos,dest_array,dest_pos,len)      
        a = Arrays.copyOf(a, a.length - 1);
        
      } else {
        i++;
      }
    }
    return a; }

  private int removeDuplicatesAndCount(int[] m) {
    int i=1,j=0,count =1;
    int[] temp=new int[m.length];
    while(i<m.length)
    {
      int prev=m[j];
      int curr=m[i];
      if(prev != curr)
      {
        count++;
        temp[j]=m[i];
      }
      
      j++;
      i++;
      
    }
    System.out.println(j);
    return count;
  }

}

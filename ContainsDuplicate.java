  package com.savitha.leetcode;
  
  import java.util.HashMap;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.Set;
  
  public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
      boolean result=false;
      int count=0;
      
      Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++)
      {
        if(hm.containsKey(nums[i]))
        {
          count=hm.get(nums[i]);
        
          hm.put(nums[i], count+1);
          System.out.println("First count:"+count);
          if(count>1){
          result=true;break;}
        }
      else
        {
        hm.put(nums[i], count);
        System.out.println(count);
        }
    }
    
      return result;
  }
    
  
    public static void main(String[] args) {
      int[] input = {1,2,2};
      ContainsDuplicate obj = new ContainsDuplicate();
      boolean result=obj.containsDuplicate(input);
      System.out.println(result);
      
  
    }
  
  }

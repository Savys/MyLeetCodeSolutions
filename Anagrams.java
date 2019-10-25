package com.savitha.leetcode;

import java.util.List;

public class Anagrams {
  public List<Integer> findAnagrams(String s, String p) {
    String needle=formAnagrams(p) ;
  //  needleInhaystack(needle);
    
    return null;
    
  }

  private String formAnagrams(String s) {
   String result = null;
   
    return result;
  }

  public static void main(String[] args) {
    
   /* String s="abab";
    String p="ab";
    Anagrams obj=new Anagrams();
    List<Integer>result=obj.findAnagrams(s,p);
    System.out.println(result);*/
    
    permutation("ABC");
  }

  private static void permutation(String input) {
    permutation("", input);
    
  }

  private static void permutation(String perm, String word) {
    if (word.isEmpty()) {
      System.err.println(perm + word);

  } else {
      for (int i = 0; i < word.length(); i++) {
          permutation(perm + word.charAt(i), word.substring(0, i) 
                                  + word.substring(i + 1, word.length()));
      }
  }
  }

}

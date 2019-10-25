package com.savitha.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutations {

  public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Please enter a string:");
   String s=scanner.nextLine();
   Set<String> permutations=generatePermutations(s);
   System.out.println("Here are the unique permutations of " + s);
   System.out.println(Arrays.toString(permutations.toArray()));
scanner.close();

  }

  static Set<String> generatePermutations(String input) {
    input=input.toLowerCase();
    Set<String>result=new HashSet<>();
    permutations(" ",input,result);
    return result;
    
    
  }

  private static void permutations(String prefix, String letters, Set<String> result) {
    if(letters.length() ==0)
    {
      result.add(prefix);
    }
    else
    {
      for(int i=0;i<letters.length();i++)
      {
        String letter=letters.substring(i,i+1);
        String otherLetters=letters.substring(0,i)+letters.substring(i+1);
        permutations(prefix+letter,otherLetters,result);
      }
    }
  }

}

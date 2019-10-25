package com.savitha.leetcode;

import java.util.Arrays;

public class SortedArraytoBSTLeetCode {
   
  static class BSTNode
  {
    int data;
    BSTNode left;
    BSTNode right;
    BSTNode(int data,BSTNode left,BSTNode right)
    {
      this.data=data;
      left=null;
      right=null;
    }
    public void printBST(BSTNode node, String str) {
      if(node ==null)
        return;
      
      System.out.println("Node" +str.toString() + " = " +node.data);
      printBST(node.left,"Left   of "+node.left);
      printBST(node.right,"Right of "+node.right);
    }
    
    
  }
  //static int root=null;
  public static void main(String[] args) {
   
    SortedArraytoBSTLeetCode bst=new SortedArraytoBSTLeetCode();
    int[] input= {2,4,1,3,6,7,5,8,9};
     Arrays.sort(input);
     System.out.println(Arrays.toString(input));
     BSTNode root=bst.genrateBST(input);
     root.printBST(root,"root");
     
     
  }
 private BSTNode genrateBST(int[] a)
 {
   return (BSTNode) generateBST(a,0,a.length-1);
   
   
 }
private BSTNode generateBST(int[] a, int start, int end) {
   if(end<start)
     return null;
   
   int mid=(start+end)/2;
   BSTNode n=new BSTNode(a[mid],null,null);
   n.left=generateBST(a,start,mid-1);
   n.right=generateBST(a,mid+1,end);
  return n;
}
}

/*An empty tree is height-balanced. A non-empty binary tree T is balanced if:
1) Left subtree of T is balanced
2) Right subtree of T is balanced
3) The difference between heights of left subtree and right subtree is not more than 1.*/
package com.savitha.leetcode;

public class CheckBinaryTreeBalancedLeetCode {

  public static void main(String[] args) {
    BTree2 root = new BTree2(5);
    root.left = new BTree2(10);
    root.right = new BTree2(15);
    root.left.left = new BTree2(20);
    root.left.right = new BTree2(25);
    root.right.left = new BTree2(30);
    root.right.right = new BTree2(35);    
    System.out.println(" Is Tree Balanced : " + (new CheckBinaryTreeBalancedLeetCode()).checkBalance(root));
    root.right.right.right = new BTree2 (40);
    root.right.right.right.right = new BTree2 (45);
    System.out.println(" Is Tree Balanced : " + (new CheckBinaryTreeBalancedLeetCode()).checkBalance(root));
  }
  public boolean checkBalance(BTree2 root){
    int result = isBalanced(root);
    if(result>0){
      return true;
    }else{
      return false;
    }
  }
  public int isBalanced(BTree2 root){
    if(root==null){
      return 0;
    }
    int leftH = isBalanced(root.left);
    if(leftH==-1){
      return -1;
    }
    int rightH = isBalanced(root.right);
    if(rightH==-1){
      return -1;
    }
    int diff = leftH-rightH;
    if(Math.abs(diff)>1){
      return -1;
    }
    return 1 + Math.max(leftH, rightH);
  }
}

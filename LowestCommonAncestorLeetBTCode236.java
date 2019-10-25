package com.savitha.leetcode;

public class LowestCommonAncestorLeetBTCode236 {

static BTNode1 root;  
public static BTNode1 main(String[] args) {
  
  root =new BTNode1(3);
  
  BTNode1 rootNode = new BTNode1(40);
  BTNode1 node20 = new BTNode1(20);
  BTNode1 node10 = new BTNode1(10);
  BTNode1 node30 = new BTNode1(30);
  BTNode1 node60 = new BTNode1(60);
  BTNode1 node50 = new BTNode1(50);
  BTNode1 node70 = new BTNode1(70);

  rootNode.left = node20;
  rootNode.right = node60;

  node20.left = node10;
  node20.right = node30;

  node60.left = node50;
  node60.right = node70;

  return root;
  
  //printTree(root);
  //System.out.print("null");
  

  }
private static void printTree(BTNode1 root2) {
BTNode1 current=root;
if(current !=null)
{
  printTree(current.left);
  System.out.print(current.data+"-->");
  printTree(current.right);
  }
  
}
  

}

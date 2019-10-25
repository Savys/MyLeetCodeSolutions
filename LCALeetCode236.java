//dont refer 
package com.savitha.leetcode;

public class LCALeetCode236 {
   static BTree2 root;
   
  public static void main(String[] args) {
    LCALeetCode236 bt=new LCALeetCode236();
    BTree2 rootNode= bt.createBTree();
    System.out.println("Inorder Order traversal of binary tree :");
    inOrderRecursiveTraversal(rootNode);
   // inOrderRecursiveTraversal(rootNode);
    
  }

  private static void inOrderRecursiveTraversal(BTree2 rootNode) {
    if(rootNode !=null){
      System.out.println(rootNode.val);
      inOrderRecursiveTraversal(rootNode.left);
      //inOrderRecursiveTraversal(rootNode.right);
      
    }
  }

  private BTree2 createBTree() {
    BTree2 rootNode=new BTree2(40);
    BTree2 node20=new BTree2(20);
    BTree2 node10=new BTree2(10);
    BTree2 node30=new BTree2(30);
    BTree2 node60=new BTree2(60);
    BTree2 node50=new BTree2(50);
    BTree2 node70=new BTree2(70);
    
    rootNode.left=node20;
    rootNode.right=node60;
    
    node20.left=node10;
    node20.right=node30;
    
    node60.left=node50;
    node60.right=node70;
    
    BTree2 result = findLCA(rootNode, node20, node10);
    if(result != null) {
      System.out.println("\nLCA is = "+result.val);
    }
    return rootNode;
  }

  private BTree2 findLCA(BTree2 rootNode, BTree2 node20, BTree2 node10) {
    // TODO Auto-generated method stub
    return null;
  }

  private static void printInOrderTraversal(BTree2 rootNode) {
    if(rootNode !=null)
    {
      System.out.println(rootNode.val);
    }
    printInOrderTraversal(rootNode.left);
    printInOrderTraversal(rootNode.right);
  }

}

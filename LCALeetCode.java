package com.savitha.leetcode;

public class LCALeetCode {

  private static Node root;
  public LCALeetCode(int data)
  {
    root=new Node(data);
  }
  
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2=new Node(4);
    Node n3=new Node(2);
    Node n4=new Node(5);
    LCALeetCode tree=new LCALeetCode(3);
    tree.add(root,n1,"left");
    tree.add(root,n2,"right");
    tree.add(n2, n3,"left");
    tree.add(n2, n4,"right");
    
       
    
    
    
  }

  private void add(Node parent, Node child, String orientation) {
    if(orientation.equals("left"))
    {
             parent.setLeft(child);
    }
    else
    {
      parent.setRight(child);
    }
    
  }

  
}

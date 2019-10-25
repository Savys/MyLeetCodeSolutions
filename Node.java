package com.savitha.leetcode;



public class Node {
  
    private int  key;
    private Node left;
    private Node right;

    Node(int key) {
      this.key = key;
      right = null;
      left = null;
    }

    public void setKey(int key) {
      this.key = key;
    }

    public int getKey() {
      return key;
    }

    public Node getLeft() {
      return left;
    }

    public Node getRight() {
      return right;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public void setRight(Node right) {
      this.right = right;
    }

  
}

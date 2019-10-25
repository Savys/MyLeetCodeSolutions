package com.savitha.leetcode;

public class invertTreeLeetCode226 {
  public BTree2 invertTree(BTree2 root) {
    if (root == null) {
        return null;
    }
    BTree2 right = invertTree(root.right);
    BTree2 left = invertTree(root.left);
    root.left = right;
    root.right = left;
    return root;
}
}

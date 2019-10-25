package com.savitha.leetcode;

public class AddTwoNumbers2LeetCode {
  /*
   * You are given two non-empty linked lists representing two non-negative
   * integers. The digits are stored in reverse order and each of their nodes
   * contain a single digit. Add the two numbers and return it as a linked list.
   * 
   * You may assume the two numbers do not contain any leading zero, except the
   * number 0 itself.
   * 
   * Example:
   * 
   * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
   * 465 = 807.
   */

  public static class Node {
    int  data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static void main(String[] args) {
    AddTwoNumbers2LeetCode leet = new AddTwoNumbers2LeetCode();
    Node n11 = new Node(2);
    Node n12 = new Node(4);
    Node n13 = new Node(3);
    n11.next = n12;
    n12.next = n13;
    n13.next = null;
    printList(n11);
    n11 = reverseNode(n11);
    String s1 = FormString(n11);
    System.out.println("After reverse:" + s1);

    Node n21 = new Node(5);
    Node n22 = new Node(6);
    Node n23 = new Node(4);

    n21.next = n22;
    n22.next = n23;
    n23.next = null;

    n21 = reverseNode(n21);

    String s2 = FormString(n21);
    System.out.println("After reverse:" + s2);
    Integer output = Integer.parseInt(s1) + Integer.parseInt(s2);
    System.out.println(output);

  }

  private static String FormString(Node n11) {
    String s1=null;
    Node temp = n11;
    StringBuilder sb=new StringBuilder();
    while (temp != null) {
     
     sb.append(temp.data);
      temp = temp.next;
    }
    
    return sb.toString();
    
  }

  private static Node reverseNode(Node n11) {
    Node current=n11;
    Node prev=null;
    Node nextNode=null;
    while(current !=null)
    {
      nextNode=current.next;
      current.next=prev;
       
      prev=current;
      current=nextNode;
    }
    n11=prev;
    return n11;
  }

  private static void printList(Node n) {
    Node temp = n;
    System.out.print("Data:");
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

}

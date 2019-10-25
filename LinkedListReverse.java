package com.savitha.leetcode;

public class LinkedListReverse {
  static Node head;

  public static void main(String[] args) {
    LinkedListReverse list = new LinkedListReverse();
    list.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    head.next = second;
    second.next = third;
    third.next = null;
    list.print(head);
    list.reverse();
   System.out.println("After reverse");
  list.print(head);
  }

  private Node reverse() {
   Node current=head;
   Node prev=null;
   Node after=null;
   if (head ==null)
    return null;
   while(current !=null)
   {
     after=current.next;
     current.next=prev;
     prev=current;
     current=after;   
   }
   head=prev;
   return head;
   
  }

  public void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  static class Node {
    private int  data;
    private Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }
}

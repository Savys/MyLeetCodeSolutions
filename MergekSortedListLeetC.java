package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergekSortedListLeetC {

	static Node head,Lhead2,Lhead3;

	public static void main(String[] args) {
		MergekSortedListLeetC mergeEng = new MergekSortedListLeetC();
		head = null;
		head=mergeEng.addEndLL(head,1);
		head=mergeEng.addEndLL(head,4);
		head=mergeEng.addEndLL(head,7);
		head=mergeEng.addEndLL(head,10);
		mergeEng.printList(head);
		Lhead2=mergeEng.addEndLL(Lhead2,2);
		Lhead2=mergeEng.addEndLL(Lhead2,5);
		Lhead2=mergeEng.addEndLL(Lhead2,8);
		Lhead2=mergeEng.addEndLL(Lhead2,11);
		mergeEng.printList(Lhead2);
		
		Lhead3=mergeEng.addEndLL(Lhead3,3);
		Lhead3=mergeEng.addEndLL(Lhead3,6);
		Lhead3=mergeEng.addEndLL(Lhead3,9);
		Lhead3=mergeEng.addEndLL(Lhead3,12);
		mergeEng.printList(Lhead3);
		List<Node>listNodes=new ArrayList<Node>();
		listNodes.add(head);
		listNodes.add(Lhead2);
		listNodes.add(Lhead3);
		mergeEng.mergekList(listNodes);
	}
	
	
	private void mergekList(List<Node>Nodelist)
	{
	 //	int listNodeSize=Nodelist.size();
	 //	System.out.println("listNodeSize: "+listNodeSize);
	  // Array<Node>allNodeArrays=Nodelist.toArray();
	 		
	private void printList(Node head2)
	{
		Node temp=head2;
		System.out.println("\nList : ");
		while (temp !=null)
		{
			System.out.print(temp.data+ "-> ");			
			temp=temp.next;
		}
	}
	private Node addEndLL(Node h,int x) {
		Node newNode = new Node(x);
		if (h == null) {
			h = newNode;
		} else {
			Node current = h;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			
		}
		return h;
	}

	class Node {
		int	data;
		Node	next;

		Node(int d) {
			this.data = d;
		}
	}

}

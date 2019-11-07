package com.savitha.leetcode;

public class ReversekNodesLeetC {
	static Node head;

	class Node {
		int	data;
		Node	next;

		Node(int d) {
			this.data = d;
		}
	}

	public static void main(String[] args) {
		ReversekNodesLeetC revEngine = new ReversekNodesLeetC();
		int k = 3;
		revEngine.addtoLast(1);
		revEngine.addtoLast(2);
		revEngine.addtoLast(3);
		revEngine.addtoLast(4);
		revEngine.addtoLast(5);
		revEngine.addtoLast(6);
		revEngine.addtoLast(7);
		revEngine.printList(head);
		head = revEngine.reverseNodeinK(head, k);
		System.out.println("");
		revEngine.printList(head);
	}

	private void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.next;
		}
		System.out.print("null");
	}

	private void addtoLast(int item) {
		Node current = head;
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private Node reverseNodeinK(Node head, int k) {
		Node current = head;
		Node prev = null;
		Node after = null;

		int count = 0;
		while (count < k && current != null) {
			after = current.next;
			current.next = prev;
			prev = current;
			current = after;
			count++;
		}
		if (after != null) {
			head.next = reverseNodeinK(current, k);
		}
		return prev;
	}
}
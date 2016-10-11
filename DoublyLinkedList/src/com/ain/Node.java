package com.ain;

public class Node {
	static int numberOfLinkedList = 0;

	Object data;

	Node prev;
	Node next;

	Node(Object data) {
		this.data = data;
		numberOfLinkedList++;
	}

}

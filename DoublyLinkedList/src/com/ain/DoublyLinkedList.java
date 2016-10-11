package com.ain;

public class DoublyLinkedList {

	static Node root;
	static Node tmp;
	static Node current;

	public void addNodes(int data) {
		Node node = new Node(data);

		if (root == null) {

			root = node;
			root.prev = null;
			root.next = null;

		} else {
			current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
			node.next = null;
		}

	}

	public void addNodes(double data) {
		Node node = new Node(data);

		if (root == null) {

			root = node;
			root.prev = null;
			root.next = null;

		} else {
			current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
			node.next = null;
		}

	}

	public void addNodes(String data) {
		Node node = new Node(data);

		if (root == null) {

			root = node;
			root.prev = null;
			root.next = null;

		} else {
			current = root;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
			node.next = null;
		}

	}

	public void insertNode(int data, int after) {

		Node node = new Node(data);

		int ithNode = 1;

		current = root;

		while (ithNode != after) {
			current.next = root;
			ithNode++;
		}

		tmp = current.next;
		current.next = node;
		node.next = tmp;
		tmp.prev = node;
		node.prev = current;

	}

	public void insertNode(double data, int after) {

		Node node = new Node(data);

		int ithNode = 1;

		current = root;

		while (ithNode != after) {
			current.next = root;
			ithNode++;
		}

		tmp = current.next;
		current.next = node;
		node.next = tmp;
		tmp.prev = node;
		node.prev = current;

	}

	public void insertNode(String data, int after) {

		Node node = new Node(data);

		int ithNode = 1;

		current = root;

		while (ithNode != after) {
			current.next = root;
			ithNode++;
		}

		tmp = current.next;
		current.next = node;
		node.next = tmp;
		tmp.prev = node;
		node.prev = current;

	}

	public void deleteNode(int nodeNumber) {

		int ithNode = 1;

		current = root;

		if (nodeNumber == 1) {
			root = current.next;
			current.next = null;
			current.prev = null;
		} else {
			while (ithNode != nodeNumber) {

				current = current.next;

				ithNode++;
			}

			if (current.next == null) {
				current.prev.next = null;
				current.prev = null;
			} else {
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}

		}

	}

	public void print() {
		current = root;

		boolean arrow = true;
		do {
			System.out.print((arrow) ? "|" + current.data + "|" : " --> " + "|" + current.data + "|");
			arrow = false;
			current = current.next;

		} while (current != null);
	}

	public void printBackwards() {

		current = root;
		boolean arrow = true;

		while (current.next != null) {
			current = current.next;
		}

		do {
			System.out.print((arrow) ? "|" + current.data + "|" : " <-- " + "|" + current.data + "|");
			arrow = false;
			current = current.prev;

		} while (current.prev != null);

		System.out.println(" <-- " + "|" + current.data + "|");

	}
}

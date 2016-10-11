package com.ain;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		list.addNodes(1);
		list.addNodes("two");
		list.addNodes(2.2);
		list.addNodes(3);
		list.addNodes("four");
		list.addNodes(5.5);
		list.addNodes(6);
		list.addNodes(7);

		list.print();
		System.out.println();
		list.printBackwards();

		System.out.println();
		System.out.println("Numbers of nods in the LinkedList is " + Node.numberOfLinkedList);

	}

}

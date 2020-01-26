package edu.kis.vh.nursery.data_structures;

import edu.kis.vh.nursery.IntDataStructure;

public class IntLinkedList implements IntDataStructure {

	public static final int DEFAULT = 0;
	private Node last;
	private int i;

	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean callCheck() {
		return last == null;
	}

	public int peek() {
		if (callCheck())
			return DEFAULT;
		return last.getValue();
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
}

class Node {

	private int value;
	private Node prev;
	private Node next;

	Node(int i) {
		setValue(i);
	}

	int getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}


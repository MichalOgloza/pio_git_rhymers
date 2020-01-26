package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int DEFAULT = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	public int top() {
		if (isEmpty())
			return DEFAULT;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
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


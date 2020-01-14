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

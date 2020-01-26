package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structures.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntDataStructure stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        stack = new IntArrayStack();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public int peek() {
        return stack.peek();
    }

    public int countOut() {
        return stack.countOut();
    }
}

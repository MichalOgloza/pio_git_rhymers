package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack stack;

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

    public boolean isFull() {
        return stack.isFull();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public int peek() {
        return stack.peek();
    }

    int countOut() {
        return stack.countOut();
    }
}

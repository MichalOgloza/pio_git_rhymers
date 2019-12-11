package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int VAL_DEFAULT = -1;
    public static final int ARRAY_CAPACITY = 11;
    final private int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == ARRAY_CAPACITY;
    }

    protected int peek() {
        if (callCheck())
            return VAL_DEFAULT;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return VAL_DEFAULT;
        return NUMBERS[total--];
    }

}

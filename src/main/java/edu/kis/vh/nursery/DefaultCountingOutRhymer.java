package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int VAL_DEFAULT = -1;
    final private int[] NUMBERS = new int[MAX_SIZE];


    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }


    boolean callCheck() {
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
    }

    public int getTotal() {
        return total;
    }

    int peek() {
        if (callCheck())
            return VAL_DEFAULT;
        return NUMBERS[total];
    }

    int countOut() {
        if (callCheck())
            return VAL_DEFAULT;
        return NUMBERS[total--];
    }

}

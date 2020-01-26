package edu.kis.vh.nursery.data_structures;

import edu.kis.vh.nursery.IntDataStructure;

public class IntArrayStack implements IntDataStructure {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int VAL_DEFAULT = 0;
    final private int[] NUMBERS = new int[MAX_SIZE];


    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }


    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int getTotal() {
        return total;
    }

    public int peek() {
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

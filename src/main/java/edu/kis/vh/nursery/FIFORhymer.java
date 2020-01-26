package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structures.IntArrayStack;
import edu.kis.vh.nursery.data_structures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {


    final private IntDataStructure temp = new IntLinkedList();
    //wybrałem IntLinkedList ze względu na dynamiczny rozmiar


    public FIFORhymer(IntArrayStack stack) {
        super(stack);
    }

    public FIFORhymer() {
    }

    //    kombinacja alt + -> pozwala przechodzenie między plikami
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}

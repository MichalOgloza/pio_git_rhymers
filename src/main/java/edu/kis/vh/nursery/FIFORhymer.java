package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
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

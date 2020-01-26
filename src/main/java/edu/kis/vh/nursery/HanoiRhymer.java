package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structures.IntArrayStack;

/**
 * Klasa dziedziczczy po DefaultCountingOutRhymer,
 * nadpisuje merodę countIn.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * pole klasy opisujące całkowitą liczbę odrzuconych elementów
     */
    private int totalRejected = 0;

    public HanoiRhymer(IntArrayStack stack) {
        super(stack);
    }

    public HanoiRhymer() {
    }

    /**
     * Getter dla total rejected
     * @return wartość pola totalRejected
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * Sprawdza czy parametr jest większy od ostatniego elementu na stosie
     * i wywołuje metodę countIn z klasy nadrzędnej, w innym wypadku element zostaje odrzucony.
     * @param in element który ma być wrzucony na stos
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}

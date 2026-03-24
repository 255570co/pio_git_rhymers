package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int FULL_RHYMER_INDICATOR = 11;

    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean checkCall() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    protected int peekaboo() {
        if (checkCall())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (checkCall())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

}
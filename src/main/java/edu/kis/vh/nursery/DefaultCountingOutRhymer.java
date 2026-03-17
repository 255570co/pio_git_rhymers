package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean checkCall() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (checkCall())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (checkCall())
            return -1;
        return numbers[total--];
    }

}

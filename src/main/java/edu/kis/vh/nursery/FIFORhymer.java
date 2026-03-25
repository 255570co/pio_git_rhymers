package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // TODO: wymaga refaktoryzacji - użycie dwóch stosów do symulacji kolejki jest niezbyt efektywne (złożoność O(n))
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!checkCall())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.checkCall())
            countIn(temp.countOut());

        return ret;
    }
}
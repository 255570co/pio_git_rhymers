package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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

package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testHanoiRhymerReject() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(10);
        rhymer.countIn(15);
        rhymer.countIn(5);

        Assert.assertEquals(1, rhymer.reportRejected());
    }
}
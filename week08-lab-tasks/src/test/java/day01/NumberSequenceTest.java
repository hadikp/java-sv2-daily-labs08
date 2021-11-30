package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    NumberSequence numSeq;

    @BeforeEach
    void init() {
        numSeq = new NumberSequence(10, 4, 18);
    }

    @Test
    void testMakeAverage() {
        System.out.println(numSeq.makeAverage());
        System.out.println(numSeq.getIntList());
        System.out.println(numSeq.closeToAverage(3));


    }

}
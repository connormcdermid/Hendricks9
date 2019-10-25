import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(test.sum(),4.45);
    }

    @org.junit.jupiter.api.Test
    void difference() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(-1.95,test.difference());
    }

    @org.junit.jupiter.api.Test
    void product() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(test.product(),4.0);
    }

    @Test
    void quotient() {
        Pair test = new Pair(9.0,4.5);
        assertEquals(2,test.quotient());
    }

    @org.junit.jupiter.api.Test
    void average() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(test.average(),2.225);
    }

    @org.junit.jupiter.api.Test
    void distance() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(1.95,test.distance());
    }

    @org.junit.jupiter.api.Test
    void max() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(3.2,test.max());
    }

    @org.junit.jupiter.api.Test
    void min() {
        Pair test = new Pair(1.25,3.2);
        assertEquals(1.25,test.min());
    }
}
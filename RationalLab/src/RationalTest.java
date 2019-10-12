/*
 * Name: Frank Gomes
 * Lab: Rational Lab
 * Date: 12-10-19
 * Extra: subtraction
 */

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {

    @org.junit.jupiter.api.Test
    void setRational() {
        Rational r = new Rational(1,2);
        r.setRational(3,2);
        assert(r.equals(new Rational(3,2)));
    }

    @org.junit.jupiter.api.Test
    void getNumerator() {
        Rational r = new Rational(1,2);
        assertEquals(r.getNumerator(),1);
    }

    @org.junit.jupiter.api.Test
    void getDenominator() {
        Rational r = new Rational(1,2);
        assertEquals(r.getDenominator(),2);
    }

    @org.junit.jupiter.api.Test
    void equals() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,2);
        assert(r1.equals(r2));
    }

    @org.junit.jupiter.api.Test
    void isSmaller() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,3);
        assert(r2.isSmaller(r1));
    }

    @org.junit.jupiter.api.Test
    void isBigger() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,3);
        assert(r1.isBigger(r2));
    }

    @org.junit.jupiter.api.Test
    void add() {
        Rational r1 = new Rational(1,4);
        Rational r2 = new Rational(1,4);
        // Assert that 1/4 (r1) + 1/4 (r2) = 1/2
        assert(r1.add(r2).equals(new Rational(1,2)));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,4);
        // Assert that 1/2 (r1) - 1/4 (r2) = 1/4 (r2)
        assert(r1.subtract(r2).equals(r2));
    }

    @org.junit.jupiter.api.Test
    void simplify() {
        Rational r = new Rational(2,4);
        // Assert that 2/4 (r) simplified is 1/2
        assert(r.simplify().equals(new Rational(1,2)));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Rational r = new Rational(1,2);
        assert(r.toString().equals("1/2"));
    }
}
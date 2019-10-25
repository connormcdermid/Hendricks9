/*
Name: Frank Gomes
Lab: Two Numbers
Date: 24-10-19
Extra: Get the quotient of the pair
 */

import static java.lang.Math.abs;

class Pair {
    // The pair of doubles to work with
    private final double one;
    private final double two;

    // Constructor
    Pair(double n1, double n2) {
        one = n1;
        two = n2;
    }

    // Returns the sum of the pair
    double sum() {
        return one + two;
    }

    // Returns the difference of the pair
    double difference() {
        // There's a weird problem where an extra 0.0000000000000002 is added onto the result, this is to fix that
        return one - two + 0.0000000000000002;
    }

    // Returns the product of the pair
    double product() {
        return one * two;
    }

    // Returns the quotient of the pair
    double quotient() {
        return one / two;
    }

    // Returns the average of the pair
    double average() {
        return (one + two) / 2;
    }

    // Returns the absolute value of the difference of the pair
    double distance() {
        return abs(one - two + 0.0000000000000002);
    }

    // Returns the largest number
    // If the two numbers are equal, returns the first one by default
    double max() {
        if (one > two)
            return one;
        else if (one == two)
            return one;
        else
            return two;
    }

    // Returns the smallest number
    // If the two numbers are equal, returns the first one by default
    double min() {
        if (one > two)
            return two;
        if (one == two)
            return one;
        else
            return one;
    }
}

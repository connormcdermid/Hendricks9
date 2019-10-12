/*
* Name: Frank Gomes
* Lab: Rational Lab
* Date: 12-10-19
* Extra: subtraction
*/

class Rational {
    // Values of the fraction
    private int num;
    private int den;

    // Constructor
    Rational(int numerator, int denominator) {
        this.num = numerator;
        this.den = denominator;
    }

    // Setter
    void setRational(int numerator, int denominator) {
        this.num = numerator;
        this.den = denominator;
    }

    // Getters
    int getNumerator() {
        return num;
    }

    int getDenominator() {
        return den;
    }

    // Comparisons

    boolean equals(Rational compare) {
        // Scale the two numerators to a common denominator
        int num1 = num * compare.getDenominator();
        int num2 = compare.getNumerator() * den;
        return num1 == num2;
    }

    boolean isSmaller(Rational compare) {
        // Scale the two numerators to a common denominator
        int num1 = num * compare.getDenominator();
        int num2 = compare.getNumerator() * den;
        return num1 < num2;
    }

    boolean isBigger(Rational compare) {
        // Scale the two numerators to a common denominator
        int num1 = num * compare.getDenominator();
        int num2 = compare.getNumerator() * den;
        return num1 > num2;
    }

    // Operations

    Rational add(Rational add) {
        // Scale the two numerators to a common denominator and add them
        int numSum = (num * add.getDenominator()) + (add.getNumerator() * den);
        // Common denominator
        int commonDen = den * add.getDenominator();
        // Simplify
        return simplify(new Rational(numSum, commonDen));
    }

    Rational subtract(Rational subtract) {
        // Scale the two numerators to a common denominator and add them
        int numSum = (num * subtract.getDenominator()) - (subtract.getNumerator() * den);
        // Common denominator
        int commonDen = den * subtract.getDenominator();
        // Simplify
        return simplify(new Rational(numSum, commonDen));
    }

    Rational simplify() {
        if (num == 0)
            return this;
        if (den == 0)
            throw new IllegalArgumentException("Supplied denominator was zero.");
        int gcf = GCF(den, num);
        return new Rational(num/gcf, den/gcf);
    }

    Rational simplify(Rational r) {
        if (r.getNumerator() == 0)
            return r;
        if (r.getDenominator() == 0)
            throw new IllegalArgumentException("Supplied denominator was zero.");
        int gcf = GCF(r.getDenominator(), r.getNumerator());
        return new Rational(r.getNumerator()/gcf, r.getDenominator()/gcf);
    }

    private int GCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCF(b, a % b);
        }
    }

    public String toString() {
        return String.format("%d/%d", num, den);
    }
}
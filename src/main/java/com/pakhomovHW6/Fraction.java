package com.pakhomovHW6;

public interface Fraction {

    Fraction plus(Fraction a);

    Fraction minus(Fraction a);

    Fraction divide(Fraction a);

    Fraction multiply(Fraction a);

    int getNumerator();

    int getDenominator();
}

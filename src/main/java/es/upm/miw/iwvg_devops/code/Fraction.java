package es.upm.miw.iwvg_devops.code;

import java.util.Objects;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return !isProper();
    }

    public boolean isEquivalent(Fraction f){
        return this.decimal() == f.decimal();
    }

    public Fraction add(Fraction f){
        int n = (this.numerator * f.getDenominator()) +
                (this.denominator * f.getNumerator());
        int d = this.denominator * f.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction multiply(Fraction f){
        return new Fraction(
                this.numerator * f.getNumerator(),
                this.denominator * f.getDenominator()
        );
    }

    public Fraction divide(Fraction f){
        return new Fraction(
                this.numerator * f.getDenominator(),
                this.denominator * f.getNumerator()
        );
    }

    public boolean isNegative(){
        return this.decimal() < 0;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
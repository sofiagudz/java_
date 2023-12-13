package com.company;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction() {
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(this.denominator != 0){
            this.denominator = denominator;
        }
        else{
            System.out.println("Denominator must not be 0!!!");
        }
    }

    public Fraction sum(Fraction f1, Fraction f2){
        int f3Denominator = Math.nok(f1.denominator, f2.denominator);
        int f3Numerator = f1.numerator * (f3Denominator / f1.denominator) + f2.numerator * (f3Denominator / f2.denominator);

        Fraction f3 = new Fraction(f3Numerator, f3Denominator);
        return f3;
    }
    public Fraction subtraction(Fraction f1, Fraction f2){
        int f3Denominator = Math.nok(f1.denominator, f2.denominator);
        int f3Numerator = f2.numerator * (f3Denominator / f2.denominator) - f1.numerator * (f3Denominator / f1.denominator);
        if(f3Numerator == 0){
            f3Denominator = 0;
        }

        Fraction f3 = new Fraction(f3Numerator, f3Denominator);
        return f3;
    }
    public Fraction multiplication(Fraction f1, Fraction f2){
        int f3Denominator = f1.denominator * f2.denominator;
        int f3Numerator = f1.numerator * f2.numerator;
        int nod = Math.nod(f3Numerator, f3Denominator);
        f3Denominator = f3Denominator/nod;
        f3Numerator = f3Numerator/nod;

        Fraction f3 = new Fraction(f3Numerator, f3Denominator);
        return f3;
    }
    public Fraction division(Fraction f1, Fraction f2){
        if(f2.numerator == 0){
            System.out.println("The numerator of the second fraction must not be 0!!!");
            return null;
        }
        int f3Denominator = f1.denominator * f2.numerator;
        int f3Numerator = f1.numerator * f2.denominator;
        int nod = Math.nod(f3Numerator, f3Denominator);
        f3Denominator = f3Denominator/nod;
        f3Numerator = f3Numerator/nod;

        Fraction f3 = new Fraction(f3Numerator, f3Denominator);
        return f3;
    }
    public Fraction Addition(Fraction f2){
        Fraction result = sum(f2, this);
        return result;
    }
    public Fraction Subtraction(Fraction f2){
        Fraction result = subtraction(f2, this);
        return result;
    }
    public Fraction Multiplication(Fraction f2){
        Fraction result = multiplication(f2, this);
        return result;
    }
    public Fraction Division(Fraction f2){
        Fraction result = division(f2, this);
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
class Math{
    static int nok(int a, int b){
        return a*b/nod(a,b);
    }
    static int nod(int a, int b){
        if(b == 0){
            return a;
        }
        return nod(b, a%b);
    }
}

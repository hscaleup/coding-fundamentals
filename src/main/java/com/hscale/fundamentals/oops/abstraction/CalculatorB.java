package com.hscale.fundamentals.oops.abstraction;

/**
 * @author Abhishek Kumar on 17/02/2024
 */
public class CalculatorB extends CalculatorA implements CalculationPremium {


    @Override
    public int division(int a, int b) {
        return a/b;
    }
    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int addition(int a, int b, int c) {
        System.out.println("Value of a: "+a+" b: "+b+" c: "+c);
        return a+b+c;
    }

}

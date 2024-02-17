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

}

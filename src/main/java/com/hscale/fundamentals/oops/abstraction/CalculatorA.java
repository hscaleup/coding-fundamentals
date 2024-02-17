package com.hscale.fundamentals.oops.abstraction;

/**
 * @author Abhishek Kumar on 17/02/2024
 */
public  class CalculatorA implements CalculationLite {

    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }





}

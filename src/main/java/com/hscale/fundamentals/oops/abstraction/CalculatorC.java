package com.hscale.fundamentals.oops.abstraction;

/**
 * @author Abhishek Kumar on 17/02/2024
 */
public class CalculatorC extends CalculatorB implements CalculationAdvance{
    @Override
    public int reminder(int a, int b) {
        return a%b;
    }
}

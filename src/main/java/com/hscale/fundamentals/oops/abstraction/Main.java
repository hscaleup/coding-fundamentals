package com.hscale.fundamentals.oops.abstraction;

/**
 * @author Abhishek Kumar on 17/02/2024
 */
public class Main {
    public static void main(String[] args) {
        CalculatorA calA=new CalculatorA();
        System.out.println(calA.addition(2,4));
        System.out.println(calA.addition(2,4,4));
        System.out.println(calA.subtraction(4,2));
        System.out.println("\n======================\n");

        CalculatorB calB=new CalculatorB();
        System.out.println(calB.addition(2,4));
        System.out.println(calB.addition(2,4,5));
        System.out.println(calB.subtraction(4,2));
        System.out.println(calB.multiplication(2,4));
        System.out.println(calB.division(4,2));

        System.out.println("\n======================\n");
        CalculatorC calC=new CalculatorC();
        System.out.println(calC.addition(2,4));
        System.out.println(calC.addition(2,4,6));
        System.out.println(calC.subtraction(4,2));
        System.out.println(calC.multiplication(2,4));
        System.out.println(calC.division(4,2));
        System.out.println(calC.reminder(4,2));


    }
}

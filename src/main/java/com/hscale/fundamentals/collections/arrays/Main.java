package com.hscale.fundamentals.collections.arrays;

/**
 * @author Abhishek Kumar on 22/02/2024
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        PlayWithArrays playWithArrays = new PlayWithArrays();
        int[] c = playWithArrays.filterEvenAndOddNumber(a);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
    }
}

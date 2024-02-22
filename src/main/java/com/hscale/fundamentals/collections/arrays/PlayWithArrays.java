package com.hscale.fundamentals.collections.arrays;

/**
 * @author Abhishek Kumar on 21/02/2024
 */
public class PlayWithArrays {

    int[] filterEvenAndOddNumber(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[i] = a[i];
            } else {
                b[i] = a[i] * 2;
            }
        }
        return b;
    }


}

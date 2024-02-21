package com.hscale.fundamentals.collections.arrays;

/**
 * @author Abhishek Kumar on 21/02/2024
 */
public class PlayWithArrays {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        for(int i=0;i<a.length;i++){

            if (a[i]%2==0){
                System.out.println(a[i]);
            }else{
                System.out.println(a[i]*2);
            }

        }

    }
}

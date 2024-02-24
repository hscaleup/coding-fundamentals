package com.hscale.fundamentals.strings;

/**
 * @author Abhishek Kumar on 24/02/2024
 */
public class Main {
    public static void main(String[] args) {
        String[] str = {"apple", "marry-gold", "mango", "fashion-sense"};
        PlayWithString playWithString = new PlayWithString();
        String[] b = playWithString.filterString(str);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}


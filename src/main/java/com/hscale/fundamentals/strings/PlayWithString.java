package com.hscale.fundamentals.strings;

/**
 * @author Abhishek Kumar on 21/02/2024
 */
public class PlayWithString {
    public static void main(String[] args) {
        String[] str = {"apple","marry-gold","mango","fashion-sense"};
        for (int i=0;i<str.length;i++){

            if (str[i].contains("-")){
                System.out.println(str[i].substring(str[i].indexOf("-")+1));
            }else {
                System.out.println(str[i]);
            }
        }
    }
}

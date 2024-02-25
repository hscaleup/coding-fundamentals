package com.hscale.fundamentals.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abhishek Kumar on 21/02/2024
 */
public class PlayWithString {

    String[] filterString(String[] str) {
        String[] s = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("-")) {
                s[i] = str[i].substring(str[i].indexOf("-") + 1);
            } else {
                s[i] = str[i];
            }
        }
        return s;
    }

    public List<String> filterNameWithS(String[] str) {
        List<String> lst = new ArrayList<>();
        for (int i=0;i<str.length;i++){
            if (str[i].toLowerCase().startsWith("s")){
                lst.add(str[i]);
            }
        }return lst;
    }

    public char getCharacterFromIndex(String str, int index) {
        return str.charAt(index);

    }

    public String printSentenceWithEvenWords(String s) {
        String[] str = s.split(" ");
        List<String> lst = new ArrayList<>();
        for (int i=0;i<str.length;i++){
            if (str[i].length()%2==0){
                lst.add(str[i]);
            }
        }return lst.toString().replace(",","").replace("[","").replace("]","");
    }

    public String insertStringAtGivenIndex(String originalString, String stringToBeInserted, int index) {
        String str1 =originalString.substring(0,index+1);
        String str2 =originalString.substring(index+1);
        return str1+stringToBeInserted+str2;
    }

    public boolean palidromeOrNot(String str) {
        char[] chars = str.toCharArray();
        String rev = "";
            for (int i=chars.length-1;i>=0;i--){

                rev = rev+chars[i];
            }
            if (str.equals(rev)){
                return true;
            }else {
                return false;
            }
        }

    public boolean checkAnagram(String str1, String str2) {
        Map<Character,Integer>  mapA = new HashMap<>();
        Map<Character,Integer>  mapB = new HashMap<>();
        if(str1.length() ==str2.length()){
            char[] strA = str1.toCharArray();
            char[] strB = str2.toCharArray();

            for (int i = 0;i<strA.length;i++){
                if (mapA.containsKey(strA[i])){
                    mapA.put(strA[i],mapA.get(strA[i])+1);
                }else {
                   mapA.put(strA[i],1) ;
                }
            }
            System.out.println("Map A: "+mapA);
            for (int i = 0;i<strB.length;i++){
                if (mapB.containsKey(strB[i])){
                    mapB.put(strB[i],mapB.get(strB[i])+1);
                }else {
                    mapB.put(strB[i],1) ;
                }

            }
            System.out.println("Map B: "+mapB);
        }
        if (mapA.equals(mapB)){
            return true;
        }
        return false;
    }
}

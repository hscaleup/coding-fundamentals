package com.hscale.fundamentals.strings;

import java.util.ArrayList;
import java.util.List;

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
}

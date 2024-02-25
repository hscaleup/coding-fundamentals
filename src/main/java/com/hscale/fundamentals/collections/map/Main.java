package com.hscale.fundamentals.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhishek Kumar on 25/02/2024
 */
public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap();
        map.put('a',1);
        map.put('p',2);
        map.put('l',1);
        map.put('e',1);
        System.out.println(map.containsKey('c'));
        if (map.containsKey('p')){
            System.out.println(map.get('p'));
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ "->" +entry.getValue());
        }


    }
}

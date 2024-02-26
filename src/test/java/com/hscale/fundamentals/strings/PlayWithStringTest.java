package com.hscale.fundamentals.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abhishek Kumar on 24/02/2024
 */
class PlayWithStringTest {
    private PlayWithString playWithString;

    @BeforeEach
    void setUp() {
        playWithString = new PlayWithString();
    }

    @Test
    void test_filterString() {
        String[] str = {"apple", "marry-gold", "mango", "fashion-sense"};
        String[] actual = playWithString.filterString(str);
        String[] expected = {"apple", "gold", "mango", "sense"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_filterString2() {
        String[] str = {"apple-", "marry-gold", "", "fashion_sense"};
        String[] actual = playWithString.filterString(str);
        String[] expected = {"", "gold", "", "fashion_sense"};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_filterString3() {
        String[] str = {"suman", "Riya", "Sumit", "Margo"}; //given
        String[] actual = playWithString.filterNameWithS(str).toArray(new String[0]);
        String[] expected = {"suman", "Sumit"};
        assertArrayEquals(expected, actual);
    }

    // Write a Java program to get the character at the given index within the string.
    @Test
    void test_CharacterWithIndex(){
        String str = "Java Exercises!";
        int index = 6;
        char actual = playWithString.getCharacterFromIndex(str,index);
        char expected = 'x';
        assertEquals(expected,actual);
    }
    //write a Java program to print all words with even length in the given string.
    //Input: s = "This is a java language"

    @Test
    void test_PrintEvenWords(){
        String s = "This is a java language";
        String actual = playWithString.printSentenceWithEvenWords(s);
        String expected= "This is java language";
        assertEquals(expected,actual);

    }
    //Insert a String into another String in Java
    //Input: originalString = "GeeksGeeks",
    //              stringToBeInserted = "For",
    //              index = 4
    //Output: "GeeksForGeeks"

    @Test
    void test_insertStringAtGivenIndex(){
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
        String actual = playWithString.insertStringAtGivenIndex(originalString,stringToBeInserted,index);
        String expected = "GeeksForGeeks";
        assertEquals(expected,actual);

    }

    @Test
    void test_palindrome(){
        String  str = "abba";
        boolean actual =playWithString.palidromeOrNot(str);
        boolean expected = true;
        assertEquals(expected,actual);

    }
    //Program to Check Two Strings Are Anagram Of Each Other in Java
    @Test
    void test_anagram(){
        String str1="apple";
        String str2 = "eappl";
        boolean actual = playWithString.checkAnagram(str1,str2);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_reverseString(){
        String str1 = "abc";
        String actual = playWithString.reversestring(str1);
        String expected = "cba";
        assertEquals(expected,actual);
    }
}

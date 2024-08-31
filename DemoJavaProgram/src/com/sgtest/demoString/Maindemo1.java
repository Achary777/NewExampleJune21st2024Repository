package com.sgtest.demoString;

public class Maindemo1 {
    public static void main(String[] args) {
        String inputString = "SHREE MATHRE NAMAH";
        int characterCount = 0;

        for (char c : inputString.toCharArray())
            characterCount++;

        System.out.println("Number of characters in the string: " + characterCount);
    }
}
package com.sgtest.demoString;

public class InterChaneBlrToMysore {

        public static void main(String[] args) {
            String sentence = "Bangalore and Mysore";
            String[] words = sentence.split(" ");
            int wordCount = words.length;

            // System.out.println("Number of words in the sentence: " + wordCount);

            System.out.print("Interchanged city names : ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }
    }


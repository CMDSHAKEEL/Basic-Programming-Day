package com.bridgelabz;

public class CharVowles {
    public static void main(String[] args) {
        System.out.println("Enter a character :");

        char ch = Utility.getUserChar();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
            System.out.println("Given character is an vowel");
        } else {
            System.out.println("Given character is a consonant");
        }
    }
}

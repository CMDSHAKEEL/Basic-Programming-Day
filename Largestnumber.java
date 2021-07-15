package com.bridgelabz;

public class Largestnumber {
    public static void main(String[] args) {
        int a = Utility.getUserInteger();     // this is from utility class
        int b = Utility.getUserInteger();     // this is from utility class
        int c = Utility.getUserInteger();
        if(a>b&&a>c)
            System.out.println(a +" is the largest number");
        else if(b>a&&b>c)
            System.out.println(b+" is the largest number");
        else
            System.out.println(c+" is the largest number");
    }
}

package com.bridgelabz;

public class Swapping {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b,c;
        System.out.println("enter the value of a and b");
        a=  Utility.getUserInteger();     // this is from utility class
        b=  Utility.getUserInteger();
        c=a;                          // here we are swapping the numbers
        a=b;                        // for example a vlaue will go in b and b value go in c
        b=c;

        System.out.println("After swapping: " +a+" "+b);
    }
}

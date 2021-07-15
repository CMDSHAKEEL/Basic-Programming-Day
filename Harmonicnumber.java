package com.bridgelabz;

public class Harmonicnumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter a number: ");
        int n= Utility.getUserInteger();
        double H=0;
        if(n>0)
        {
            for(int i=1;i<=n;i++)
                H=H+(1.0/i);
            System.out.println("Harmonic number is: "+H);
        }
        else
            System.out.println("Enter number greater than 0");
    }
}

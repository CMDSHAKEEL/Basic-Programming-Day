package com.bridgelabz;

public class LeapYear {
    public static void main(String[] args) {
        boolean isLeapYear =true;
        System.out.println("Enter a year to check if its a leap  year: ");
        int yearToCheck = Utility.getUserInteger();              // this is from utility class

        if(Integer.toString(yearToCheck).length()== 4) {        // here we are giving leapyear logic
            if(yearToCheck % 4 ==0 ) {                              //in if else statment
                if(yearToCheck % 100 ==0) {
                    if(yearToCheck % 400 == 0) {
                        isLeapYear = true;
                    }
                    else
                    {
                        isLeapYear = false;

                    }
                    isLeapYear = true;
                }

                isLeapYear = true;
            }
            else {
                isLeapYear = false;
            }
        }
        else {
            System.err.println("Entered year is not valid!");
        }
        System.out.println("is leap year? : "+isLeapYear);
    }
}

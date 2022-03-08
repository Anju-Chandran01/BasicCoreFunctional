package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year (YYYY) :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year > 1000) && (year < 9999)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Year " + year + " is a leap year");
            else
                System.out.println("Year " + year + " is not a leap year");
        } else {
            System.out.println("Enter the year in YYYY format");
        }
    }
}

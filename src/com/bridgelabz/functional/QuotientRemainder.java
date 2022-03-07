package com.bridgelabz.functional;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Enter both numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //CALCULATE QUOTIENT AND REMAINDER
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The quotient is : " + quotient);
        System.out.println("The remainder is : " + remainder);
    }
}

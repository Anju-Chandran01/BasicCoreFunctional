package com.bridgelabz.functional;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to swap : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Numbers before swaping are "+num1 +" "+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap numbers are " + num1 +" " + num2);
    }
}

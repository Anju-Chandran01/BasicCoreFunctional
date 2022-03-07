package com.bridgelabz.functional;

import java.util.Scanner;

//PROGRAM TO FIND LARGEST AMONG THREE NUMBERS
public class LargestAmongThree {
    public static void main(String[] args) {
        System.out.println("---- Largest among three numbers ---");
        int num1;
        int num2;
        int num3;

        Scanner no = new Scanner(System.in);

        //READ INPUTS
        System.out.println("Enter the first number.");
        num1 = no.nextInt();
        System.out.println("Enter the second number.");
        num2 = no.nextInt();
        System.out.println("Enter the third number.");
        num3 = no.nextInt();

        if (num1 >= num2 && num1 >=num3)
            System.out.println(num1 + " is the largest number");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number");
        else
            System.out.println(num3 + " is the largest number");
    }
}


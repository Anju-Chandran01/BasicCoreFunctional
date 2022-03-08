package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("The prime factors of " +num +" =");

        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num = num/2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num/i;
            }
        }
        if (num > 2)
            System.out.print(num);
    }
}

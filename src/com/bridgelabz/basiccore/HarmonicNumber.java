package com.bridgelabz.basiccore;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //CALCULATE SUM
        float sum =0;
        if(num > 0) {
            for (int i = 1; i <= num; i++) {
                sum = sum + 1 / i;
                System.out.print("1/" + i + " ");
            }
            System.out.println(" is the Harmonic Series");
            System.out.println("And the sum is : " + sum);
        }else{
            System.out.println("Enter a number other than zero");
        }
    }
}

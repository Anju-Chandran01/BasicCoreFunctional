package com.bridgelabz.basiccore;

import java.util.Scanner;

public class CoinFlipPercentage {

    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times coin flip : ");
        int numFlip = in.nextInt();
        if (numFlip > 0) {

            //NO: OF HEADS AND TAIL
            for (int i = 0; i < numFlip; i++) {
                double coinSide = Math.random();
                if (coinSide > 0.5)
                    heads++;
                else
                    tails++;
            }
            System.out.println("Heads : " + heads);
            System.out.println("Tails : " + tails);

            //CALCULATE PERCENTAGE
            float headsPercentage = heads * 100 / n;
            float tailsPercentage = tails * 100 / n;
            System.out.println("Percentage of Heads : " +headsPercentage);
            System.out.println("Percentage of Tails : " +tailsPercentage);
        }
    }
}

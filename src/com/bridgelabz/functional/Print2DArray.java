package com.bridgelabz.functional;

import java.util.Scanner;

public class Print2DArray {

    static Scanner sc = new Scanner(System.in);
    static void getArray(int X, int Y){
        int [] [] arr = new int[X][Y];
        for (int i=0; i<X;i++){
            for (int j=0; j<Y;j++){
                //TO PRINT EACH POSITION IN MATRIX
                System.out.print("Enter The Value at : "+i+" "+j+" : ");
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();

        //PRINT THE ARRAY
        for (int i=0; i<X;i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Row Size : ");
        int rowSize = sc.nextInt();                                  // for row input
        System.out.println("Enter The Column Size : ");
        int columnSize = sc.nextInt();                                // for column input
        getArray(rowSize,columnSize);
    }
}

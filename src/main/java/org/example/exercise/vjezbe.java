package org.example.exercise;


public class vjezbe {
/*    public static int GCD(int a, int b) {
        int result=1;
        for (int i=1;i<=a && i<=b;i++) {
            if(a%i==0 && b%i==0) {
                result = i;
            }
        }
        return result;
    }*//*
    public static void printInvertedTableNumber(int start,int end,int number){
        for(int i=end;i>=start;i--){
            System.out.println(i+" * "+number+" = "+(i*number));
        }
    }*/

    public static void main(String[] args) {
       // printInvertedTableNumber(1,10,3);
        int N = 5;

        // Outer loop runs N times, once for each row
        for (int i = 1; i <= N; i++) {
            // Inner loop prints 'i - 1' spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Inner loop prints 'N - i + 1' stars
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }


    }
}
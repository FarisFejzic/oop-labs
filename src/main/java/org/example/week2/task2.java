package org.example.week2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int n = 3;
        for (int i = 0; i < n; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            double number = sc.nextDouble();
            sum += number;
        }
        System.out.println("Sum of the number is " + sum);
    }
}

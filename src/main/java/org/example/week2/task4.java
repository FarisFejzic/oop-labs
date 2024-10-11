package org.example.week2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1=Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number: ");
        int number2=Integer.parseInt(sc.nextLine());
        if(number1<number2) {
            for (int i = number1 + 1; i < number2; i++) {
                System.out.println(i);
            }
        }
        else
            System.out.println( number1 +" "+ number2);


    }
}

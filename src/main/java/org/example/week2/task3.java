package org.example.week2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double sum=0;
        double number;
        while(true){
            number=sc.nextDouble();
            if(number!=0){
                sum+=number;
            }
            else
                break;
        }
        System.out.println("Sum of entered numbers is: " +sum);
    }
}

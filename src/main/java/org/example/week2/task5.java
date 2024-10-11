package org.example.week2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<=n;i++){
            sum+=Math.pow(2,i);
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}

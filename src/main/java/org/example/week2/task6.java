package org.example.week2;

import java.util.Scanner;

public class task6 {
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args){
        System.out.println("Enter how many times do you want sentence to be repeated: ");
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            printText();
        }

    }
}

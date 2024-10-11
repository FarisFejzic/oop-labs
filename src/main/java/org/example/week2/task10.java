package org.example.week2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int guesses=1;
        int solution=42;
        Scanner sc = new Scanner(System.in);
        while (true){
            int guess=Integer.parseInt(sc.nextLine());
            if(guess<solution){
                System.out.println("Higher! - This is your " +guesses+" guess");
                guesses++;
            }
            else if(guess>solution){
                System.out.println("Lower! - This is your " +guesses+" guess");
                guesses++;
            }
            else {
                System.out.println("You are correct! ");
                System.out.println("This is your " + guesses +" guess");
            }
        }
    }
}

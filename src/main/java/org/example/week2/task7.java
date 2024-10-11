package org.example.week2;

public class task7 {
    public static void drawStarsPiramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        drawStarsPiramid(5);
    }
}

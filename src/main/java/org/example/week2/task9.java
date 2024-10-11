package org.example.week2;

public class task9 {
    public static void drawNumbersPiramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        drawNumbersPiramid(5);
    }

}

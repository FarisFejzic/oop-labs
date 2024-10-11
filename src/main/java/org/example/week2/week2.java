package org.example.week2;
import java.util.Scanner;

public class week2 {
    public static void main(String[] args){
        String password="Onomatopeja";
        while (true){
            Scanner sc=new Scanner(System.in);
            String ps=sc.nextLine();
            if(ps.equals(password)){
                System.out.println("Secret code is: 21232312");
                break;

            }
            else {
                System.out.println("Wrong password try again");
            }
        }
    }
}

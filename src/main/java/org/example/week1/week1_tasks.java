package org.example.week1;
import java.util.Scanner;
//1.
/*
public class week1_tasks {
    public static void main(String[] args) {
        System.out.print("My name is Faris Fejzić");
    }
}

*/
//2.
/*

public class week1_tasks {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("\t(And all people of the world)");
    }
}

 */
//3.
/*
public class week1_tasks {
    public static void main(String[] args){
       int seconds=60;
       int minutes=60;
       int hours=24;
       int days=365;
       System.out.println("There are "+(seconds*minutes*hours*days)+" seconds in a year");
    }
}
 */
//4.
/*
public class week1_tasks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());
        System.out.print("Sum of number "+number1+" and number  "+number2+" is: "+(number1+number2));
    }
}
*/

//5
/*
public class week1_tasks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        if(n>0){
            System.out.println("Number "+n+" is a positive number");
        }
        else if(n<0){
            System.out.println("Number "+n+" is a negative number");
        }
        else{
            System.out.println("Zero is neither a positive number or a negative number");
        }
    }
}*/
//6.

public class week1_tasks {
    public static void main(String[] args){
        System.out.println("Please enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else if (num1<num2){
            System.out.println(num1+" is less than "+num2);

        }
        else {
            System.out.println(num1+" is equal to "+num2);
        }

    }
}


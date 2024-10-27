package org.example.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle("Red",FillType.FILLED,12.3);
        Rectangle rectangle=new Rectangle("Cyan",FillType.NOT_FILLED,4.5,7.2);

        System.out.println("Circle info: ");
        circle.displayInfo();

        System.out.println("Rectangle info: ");
        rectangle.displayInfo();



    }
}

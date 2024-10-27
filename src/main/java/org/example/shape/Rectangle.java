package org.example.shape;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(String color,FillType fillType,double height,double width){
        super(color,fillType);
        this.height = height;
        this.width = width;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }
    public double getArea() {
        return width * height;
    }

}

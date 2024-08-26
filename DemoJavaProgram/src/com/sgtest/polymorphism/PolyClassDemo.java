package com.sgtest.polymorphism;
abstract class GeometricFigure
{
    abstract void area();
}
class Square extends GeometricFigure
{
    void area()
    {
        int side=7;
        System.out.println("Area of the Square : "+(side*side));
    }
}
class Rectangle extends GeometricFigure
{
    void area()
    {
        int length=8, width=6;
        System.out.println("Area of Rectangle : "+(length*width));
    }
}
class Circle extends GeometricFigure
{
    void area()
    {
        double pi=3.41;
        double r=2.5;
        System.out.println("Area of Circle : "+(pi*r*r));
    }
}
public class PolyClassDemo {
    public static void main(String[] args) {
        GeometricFigure figure=null;

        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();

        figure=square;
        figure.area();
      //  square.area();
        figure=rectangle;
        figure.area();

        figure=circle;
        figure.area();
    }
}

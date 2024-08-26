package com.sgtest.methods.returnassignments;

class Fcolor{
    String getcolorName(String color)
    {
        return color;
    }
}
public class Color {
    public static void main(String[] args) {
        Fcolor fc=new Fcolor();
        String v1=fc.getcolorName("Green");
        System.out.println("Favourite color name : "+v1);
    }
}

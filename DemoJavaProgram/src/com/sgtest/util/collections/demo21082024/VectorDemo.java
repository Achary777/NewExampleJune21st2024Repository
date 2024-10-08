package com.sgtesting.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByEnumeration();
    //    readElementsByIterator();
    //    withOutGenerics();
    }

    private static void addElements()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add(1,"Watermelon");
        System.out.println("Elements :"+obj);
        Vector<String> obj1=new Vector<String>();
        obj1.add("Green");
        obj1.add("Blue");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add(1,"Watermelon");
        System.out.println("Elements :"+obj);
        obj.remove(1);
        System.out.println("Elements :"+obj);
        obj.remove("Banana");
        System.out.println("Elements :"+obj);
        obj.removeAll(obj);
        System.out.println("Elements :"+obj);
    }

    private static void readElements1()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(String str:obj)
        {
            System.out.println(str);
        }
    }

    private static void readElements2()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByEnumeration()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        Enumeration<String> elements =obj.elements();
        while(elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }
    }

    private static void readElementsByIterator()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        Iterator<String> ite=obj.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
    }

    private static void withOutGenerics()
    {
        Vector obj=new Vector();
        System.out.println("Elements :"+obj);
        obj.add(45);
        obj.add(true);
        obj.add("Mango");
        obj.add(10.175);
        obj.add('Y');
        obj.add("Bangalore");
        System.out.println("Elements :"+obj);
    }
}

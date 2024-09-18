package org.example.sirs17092024.reflection4;

public class SampleDemo {
    public static void main(String[] args) {

        try
        {
            Class.forName("org.example.sirs17092024.reflection4.Sample");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

package com.sgtest.methods.assignments;

    //Q1: Write a method to display the characters from P to Z ?

class Chara
{
    void characterPtZ()
    {

        for(char i='P'; i<='Z'; i++)
        {
            System.out.print(i+" ");
        }
    }
}
public class Assigment1 {
    public static void main(String[] args) {
        Chara cpz=new Chara();
        cpz.characterPtZ();
    }
}

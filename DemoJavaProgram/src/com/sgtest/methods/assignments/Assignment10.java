package com.sgtest.methods.assignments;

  //Q10: Write a method to display sum of prime numbers in btw 200 to 100 ?
  class Sumprime
  {
      void sumP()
      {
          int num=100;
          int f;
          int sum=0;
          for(int i=200;i>=num;i--) {
              f=0;
              for (int j = 2; j <i/2; j++) {
                  if (i % j == 0) {
                      f++;
                      break;   //becz it can be divide first no no need to go next num
                  }
              }
              if (f == 0) {
                  sum=sum+i;
              }
          }
          System.out.println("Sum of Prime Numbers From 200 to 100:"+sum);
      }
  }
public class Assignment10 {
    public static void main(String[] args) {
        Sumprime o1=new Sumprime();
        o1.sumP();
    }
}
package com.sgtest.assignarrays1d;

public class A2Divisible7Alternative
{
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0) {
                count = count + 1;
            }
        }
        System.out.println("No of counts which are divisible by 7 :" + count);
        System.out.println("**********************");

        int[] a = new int[count];
        int k = 0;
        for (int j = 100; j >= 1; j--) {
            if (j % 7 == 0) {
                a[k] = j;
                k = k + 1;
            }
        }

        for (int z = a.length; z >= 1; z--) {
            if (z % 2 == 0) {
                System.out.println(z);

            }
        }

    }

}



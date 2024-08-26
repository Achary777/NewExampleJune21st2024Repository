package com.sgtest.methods.returnassignments;

class EvenNo10t20 {
         int[] evenNo(int even[])
        {
            int[] arr=new int[even.length];
            int k=0;
            for(int j=0; j<even.length; j++)
            {
                arr[k]=even[j];
                k++;
            }
            return even;
        }

}
public class EvenNo {
    public static void main(String[] args)
    {
       int even[]={10,12,14,16,18,20};
       EvenNo10t20 ev=new EvenNo10t20();
      int z[]=ev.evenNo(even);
       for(int val:z)
       {
           System.out.println(val);
       }
    }
}

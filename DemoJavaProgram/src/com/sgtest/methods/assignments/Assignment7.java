package com.sgtest.methods.assignments;

    //Q7: For given 2d 3*3 char array assign each element into 2D 3*3 array & read int array ?

class CastChar_int
{
    void castCharInt(char a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        int index1=0;
        int index2=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                b[index1][index2]=(int) a[i][j];
                System.out.print(b[index1][index2]+" ");
            }
            System.out.println();
        }
    }

}
public class Assignment7 {
    public static void main(String[] args) {
        CastChar_int cri=new CastChar_int();
        cri.castCharInt(new char[][]{{'I','N','D'},{'I','A','N'},{'A','R','M'}});
    }
}

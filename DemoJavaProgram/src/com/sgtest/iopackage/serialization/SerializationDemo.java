package com.sgtest.iopackage.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
//        writeObjectToFile();    //First run this one to create a byte code file
        readObjectFromFile();     //2nd run this one to read the created a byte code file
    }

    private static void writeObjectToFile()
    {
        FileOutputStream fout=null;
        ObjectOutputStream out=null;
        Employee obj=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo1\\Employee.ser");
            out=new ObjectOutputStream(fout);

            obj=new Employee("Santosh","Manager",9500,"Research");

            out.writeObject(obj);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                    out.flush();
                    out.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void readObjectFromFile()
    {
        FileInputStream fin=null;
        ObjectInputStream in=null;
        Employee obj=null;
        try
        {
            fin=new FileInputStream("D:\\Demo1\\Employee.ser");
            in=new ObjectInputStream(fin);

            obj=(Employee) in.readObject();

            obj.showFN();
            obj.showJobName();
            obj.showSalary();
            obj.showDeptName();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                in.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

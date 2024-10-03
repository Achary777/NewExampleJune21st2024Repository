package org.example.db;

import java.sql.*;

public class DBOperationsUsingPreparedStatementDemo {
    public static void main(String[] args) {
       readRecords();
//        insertRecords();
    }

    private static void readRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("DB has connect successfully!!");

            String sql="select * from dept";
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery(sql);
            ResultSetMetaData rsdata =rs.getMetaData();
            String col1=rsdata.getColumnName(1);
            String col2=rsdata.getColumnName(2);
            String col3=rsdata.getColumnName(3);
            System.out.printf("%-12s",col1);
            System.out.printf("%-12s",col2);
            System.out.printf("%-12s",col3);
            System.out.printf("\n");
            while(rs.next())
            {
                String deptno=rs.getString("DEPTNO");
                String deptName=rs.getString("DNAME");
                String loc=rs.getString("LOC");
                System.out.printf("%-12s",deptno);
                System.out.printf("%-12s",deptName);
                System.out.printf("%-12s",loc);
                System.out.printf("\n");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void insertRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("DB has connect successfully!!");

            String sql="insert into dept values(80,'INVOICES','ATTIGUPPE')";
            PreparedStatement stmt=conn.prepareStatement(sql);
            int status=stmt.executeUpdate(sql);
            if(status>0) System.out.println("Record has inserted successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

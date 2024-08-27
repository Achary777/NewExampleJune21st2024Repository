package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign8_ReadAndWriteIntoNewExcelFile {
    public static void main(String[] args) {
        readWriteContent();
    }

    private static void readWriteContent()
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        Workbook wb1=null;
        Workbook wb2=null;
        Sheet sh1=null;
        Sheet sh2=null;
        Row rowsh1=null;
        Row rowsh2=null;
        Cell cellsh1=null;
        Cell cellsh2=null;
        try
        {
            fin=new FileInputStream("D:\\Demo1\\EXCEL\\EmployeeDetails.xlsx");
            wb1=new XSSFWorkbook(fin);
            wb2=new XSSFWorkbook();
            sh1=wb1.getSheet("Sheet1");
            sh2=wb2.getSheet("EmployeeDetails");
            if(sh2==null)
            {
                sh2=wb2.createSheet("EmployeeDetails");
            }

            int rc=sh1.getPhysicalNumberOfRows();
            for(int r=0;r<rc;r++)
            {
                rowsh1=sh1.getRow(r);
                rowsh2=sh2.getRow(r);
                if(rowsh2==null)
                {
                    rowsh2=sh2.createRow(r);
                }

                int cc=rowsh1.getPhysicalNumberOfCells();
                for(int c=0;c<cc;c++)
                {
                    cellsh1=rowsh1.getCell(c);
                    String data=cellsh1.getStringCellValue();

                    cellsh2=rowsh2.getCell(c);
                    if(cellsh2==null)
                    {
                        cellsh2=rowsh2.createCell(c);
                        cellsh2.setCellValue(data);
                    }

                }
            }
            fout=new FileOutputStream("D:\\Demo1\\EXCEL\\NewEmployeeDetails.xlsx");
            wb2.write(fout);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                fout.close();
                wb1.close();
                wb2.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

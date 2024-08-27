package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Assign5_20Vegetables {
    public static void main(String[] args) {
        writeVege5thColoumn();
    }

    public static void writeVege5thColoumn()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("VegetableNames");

            for (int i=1;i<=20; i++)
            {
                row = sh.createRow(i-1);
                cell=row.createCell(4);  //4 becz index starts with 0 so if we want 5th we need to -1,
                cell.setCellValue("VegetableName"+i);
            }

            fout=new FileOutputStream("D:Demo1\\EXCEL\\Vegetable5thcoloumn.xlsx");
            wb.write(fout);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                fout.close();
                wb.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

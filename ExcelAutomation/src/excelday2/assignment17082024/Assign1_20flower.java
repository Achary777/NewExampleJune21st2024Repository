package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Assign1_20flower {
    public static void main(String[] args)

    {
        writeflowerNames();
    }


        //Q1: PW 20 flower names into first sheet, First Column of Excel file ?
    public static void writeflowerNames()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;

            try
            {
                wb=new XSSFWorkbook();
                sh=wb.createSheet("20Flowers");

                //1st ROW
                for (int i=1; i<=20; i++) {
                    row = sh.createRow(i-1);
                    cell = row.createCell(0);
                    cell.setCellValue("Flower"+i);
                }
                fout=new FileOutputStream("D:Demo1\\EXCEL\\Flower.xlsx");
                wb.write(fout);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    fout.close();
                    wb.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
    }
 }


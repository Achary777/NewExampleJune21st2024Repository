package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Assign3_FlowerColor {
    public static void main(String[] args) {
        writeFlowerColor();
    }
//Q3: PW 20Flower names and respective color names in 1st and 2nd column of excel file sheet1 ?
    public static void writeFlowerColor()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
//        Row row1=null;
//        Cell cell1=null;


        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("FlowersColor");

            //1st row 1st colonm
            for (int i=0; i<20; i++)
            {
                row=sh.createRow(i);
                cell=row.createCell(0);
                cell.setCellValue("Flower"+i);

//                for (int j=0; j<20; j++)
//                {
//                    row=sh.createRow(1);
                    cell=row.createCell(1);
                    cell.setCellValue("Color"+i);
//                }
            }


            fout=new FileOutputStream("D:Demo1\\EXCEL\\FlowerWithColor.xlsx");
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

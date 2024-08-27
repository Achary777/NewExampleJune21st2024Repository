package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Assign2_20Fruites {
    public static void main(String[] args) {
            writeNameFruits();
    }

    //Q2: Programmatically write 20 Fruits names into 1st sheet. 10th row of Excel file ?
    public static void writeNameFruits()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;

        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("20FruitsName");

            //ForLoop used to iterate 20Fruits Names

            row = sh.createRow(9);
            for (int i=0; i<20; i++)
            {
                cell = row.createCell(i);
                cell.setCellValue("Fruit" + i);
                /*
                for (int j=0;j<20;j++) {
                    if (i == j)
                        row = sh.createRow(0);  // i: 9 is 9th starting than its printing i
                    cell = row.createCell(0);
                    cell.setCellValue("Fruit" + i);
                } */
            }
            fout=new FileOutputStream("D:Demo1\\EXCEL\\FruitNames.xlsx");
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

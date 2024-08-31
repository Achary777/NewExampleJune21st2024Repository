package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign7_Sheet1RowToSheet2Column
{
    public static void main(String[] args)
    {

        readContentFromSheet1andDisplaySheet2into1stRow();
    }

    public static void readContentFromSheet1andDisplaySheet2into1stRow() {

        FileInputStream fin = null;    //Step1.1: to Read from which already existing exel file
        FileOutputStream fout1 = null;  //Step1: to Create File
        Workbook wb = null;            //Step2: We need to create workbook file
        Sheet sh1 = null;              //Step3 : Creating a Sheet1 for rows and columns
        Row rowsh1 = null;              //Step4 : Creating row1 bcx excel have row
        Cell cellsh1 = null;            //Step5:  Creating cell1 for row Where we can write content

        Sheet sh2 = null;             //Step6: Creating a Sheet2 for writing content from sheet1
        Row rowsh2 = null;              //Step7:
        Cell cellsh2 = null;             //Step8:

        try {
            fin = new FileInputStream("D:Demo1\\EXCEL\\FruitSheet1RowToSheet2Column.xlsx");
            wb = new XSSFWorkbook(fin);
            sh1 = wb.getSheet("Sheet1");        //Sh1: SourceSheet
            sh2 = wb.getSheet("Sheet2");       //Sh2: DestinationSheet
            if(sh2==null)
            {
                sh2=wb.createSheet("Sheet2");
            }
            rowsh1=sh1.getRow(0);
            int cc = rowsh1.getPhysicalNumberOfCells();       // Sh1:SourceSheet

            int r=0;
            for (int c = 0; c <cc; c++)
            {
                    cellsh1=rowsh1.getCell(r);
                    rowsh2=sh2.getRow(r);
                    if (rowsh2==null)
                    {
                        rowsh2=sh2.createRow(r);
                        r=r+1;
                    }
                    //1st Sheet Cell
                        cellsh1 =rowsh1.getCell(c);
                    String data = cellsh1.getStringCellValue();

                    //  2nd Sheet Cell
                        cellsh2=rowsh2.createCell(0);
                        cellsh2.setCellValue(data);
            }
            fout1 = new FileOutputStream("D:Demo1\\EXCEL\\FruitSheet1RowToSheet2Column.xlsx");
            wb.write(fout1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                fout1.close();
                wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign6_1sheetTo2sheet
{
    public static void main(String[] args)
    {
//        writeContentintoSheet1();

        readContentFromSheet1andDisplaySheet2into1stRow();
    }

    public static void writeContentintoSheet1()
    {
        FileOutputStream fout=null;  //Step1: to Create File
    //    FileInputStream fin=null;    //Step1.1: to Read from which already existing exel file
        Workbook wb=null;            //Step2: We need to create workbook file
        Sheet sh=null;              //Step3 : Creating a Sheet1 for rows and columns
        Row row=null;              //Step4 : Creating row1 bcx excel have row
        Cell cell=null;            //Step5:  Creating cell1 for row Where we can write content

//        Sheet sh2=null;             //Step6: Creating a Sheet2 for writing content from sheet1
//        Row row2=null;              //Step7:
//        Cell cell=null;             //Step8:



        try
        {
            //////////////////SHEET 1 FOR  Writing the Content /////////////////////////////////
            wb=new XSSFWorkbook();                  //Step9: Allocating Workbook format to wb variable
            sh=wb.createSheet("Sheet1FruitName");    //Step10: Declaring sheet1 name as "FruitName"

            for (int i=1; i<=20; i++)               //Step11: Forloop is for creating 1st Columns value upto 20
            {
                row=sh.createRow(i-1);        //Step12: This for row
                cell=row.createCell(0);       //Step13: This for column which is constant i.e "0"
                cell.setCellValue("FruitName"+i);  //Step14: Giving the cells to fruit names by iterating values
            }

            //Step15: Giving file path to create file which have name by "FruitSheet1ToSheet2.xlsx"
            fout=new FileOutputStream("D:Demo1\\EXCEL\\FruitSheet1ToSheet2.xlsx");

            //Step16: Whatever date availble in fout , that can be written using below command to workbook
            wb.write(fout);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

//////////////////SHEET 2 FOR  READING the Content from sheet1 and displaying sheet2 into 1st ROW /////////////////////////////////

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
            fin = new FileInputStream("D:Demo1\\EXCEL\\FruitSheet1ToSheet2.xlsx");
            wb = new XSSFWorkbook(fin);
            sh1 = wb.getSheet("Sheet1FruitName");        //Sh1: SourceSheet
            sh2 = wb.getSheet("Sheet2FruitName");       //Sh2: DestinationSheet
            if (sh2 == null) {
                sh2 = wb.createSheet("Sheet2FruitName");
            }

            int rc = sh1.getPhysicalNumberOfRows();       // Sh1:SourceSheet

            //Store row elements in a String array
            String [] str=new String[rc];

            for (int r = 0; r < rc; r++) {
                rowsh1 = sh1.getRow(r);
                rowsh2 = sh2.getRow(r);
                if (rowsh2 == null) {
                    rowsh2 = sh2.createRow(0);
                }

                int cc = rowsh1.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) {
                    cellsh1 = rowsh1.getCell(c);
                    String data = cellsh1.getStringCellValue();
                    str[r] = data;
                }
            }

            for (int k=0; k<rc ; k++)
            {
                    cellsh2 = rowsh2.getCell(k);
                    if (cellsh2 == null)
                    {
                        cellsh2 = rowsh2.createCell(k);
                        cellsh2.setCellValue(str[k]);
                    }

            }
            fout1 = new FileOutputStream("D:Demo1\\EXCEL\\FruitSheet1ToSheet2.xlsx");
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

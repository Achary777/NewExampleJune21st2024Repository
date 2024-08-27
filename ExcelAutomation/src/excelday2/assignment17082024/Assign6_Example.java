package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign6_Example
{
    public static void main(String[] args) {
        ReadWriteFruits();
    }
    private static void ReadWriteFruits()
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sourcesheet = null;
        Sheet destinationsheet = null;
        Row rowsrc = null;
        Row rowdst = null;
        Cell cellsrc = null;
        Cell celldst = null;

        try
        {
            fin = new FileInputStream("D:Demo1\\EXCEL\\FruitsReadfile1.xlsx");
            wb = new XSSFWorkbook(fin);
            sourcesheet = wb.getSheet("Sheet1");
            destinationsheet = wb.getSheet("Sheet2");

            if (destinationsheet == null)
            {
                destinationsheet = wb.createSheet("Sheet2");
            }

            int rc = sourcesheet.getPhysicalNumberOfRows();
            //store row elements in a string array
            String [] str=new String[rc];
            for (int i = 0; i < rc; i++) {
                rowsrc = sourcesheet.getRow(i);
                rowdst = destinationsheet.getRow(i);
                if (rowdst == null)
                {
                    rowdst = destinationsheet.createRow(0);
                }

                int cc = rowsrc.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) {
                    cellsrc = rowsrc.getCell(c);
                    String data = cellsrc.getStringCellValue();
                    str[i] = data;
                }
            }
            for(int j=0;j<rc;j++)
            {
                celldst = rowdst.getCell(j);
                if (celldst == null)
                {
                    celldst = rowdst.createCell(j);
                    celldst.setCellValue(str[j]);
                }
            }
            fout = new FileOutputStream("D:Demo1\\EXCEL\\FruitsReadfile1.xlsx");
            wb.write(fout);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                fout.close();
                wb.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

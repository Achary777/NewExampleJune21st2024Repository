package excelday2.assignment17082024;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class Assign4_CityDiagnolly {
    public static void main(String[] args) {
        cityDiagonal();
    }
    public static void cityDiagonal()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;

        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("CityNames");

            for (int i=1; i<=20; i++)
            {
                row= sh.createRow(i-1);   //i-1 bcz To get sequences 1 to 20
                cell=row.createCell(i-1);
                cell.setCellValue("City"+i);
            }
            fout=new FileOutputStream("D:Demo1\\EXCEL\\CityDiagonal.xlsx");
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

// TODO Auto-generated method stub
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelFileReader {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        // ..
        // System.out.println("Hello");
        FileInputStream file = new FileInputStream(new File(
                "/home/varun/Downloads/CapitalGainSummaryXLS.xls"));

        // Get the workbook instance for XLS file
        HSSFWorkbook workbook = new HSSFWorkbook(file);

        // Get first sheet from the workbook
        HSSFSheet sheet = workbook.getSheetAt(0);
        String shareName = "";
        int quantity = 0;

        Date buyDate = null;
        String buyDateStr = "";
        String sellDateStr = "";
        Date sellDate = null;
        float buyRate = 0;
        float sellRate = 0;
        String mtrString="";

        // //Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = sheet.iterator();

        while (rowIterator.hasNext()) {
            
            Row row = rowIterator.next();
            
            if (row.getRowNum() < 7
                    || (row.getRowNum() > 12 && row.getRowNum() < 17)
                    || (row.getRowNum() > 34 && row.getRowNum() < 39))
                continue;
            
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                if (i == 0)
                    shareName = cell.getStringCellValue();
                if (i == 1)
                    quantity = new Double(cell.getNumericCellValue())
                            .intValue();
                if (i == 2) {
                    buyDate = new Date(cell.getStringCellValue());
                    buyDateStr = buyDate.getDate() + "/" + (buyDate.getMonth()+1)
                            + "/" + (buyDate.getYear()+1900);
                    //System.out.println(buyDate.toString());
                }
                if (i == 3) {
                    sellDate = new Date(cell.getStringCellValue());
                    sellDateStr = sellDate.getDate() + "/" + (sellDate.getMonth()+1)
                            + "/" + (sellDate.getYear()+1900);
                    //System.out.println(buyDate.toString());
                }
                 if (i == 4){
                     Double d = cell.getNumericCellValue();
                     buyRate = d.floatValue();               
                 }
                if (i == 5){
                 Double d = cell.getNumericCellValue();
                 sellRate = d.floatValue();                
                }
                i++;

            }
            mtrString = "\"Shares\","+"\""+shareName +"\",\"Yes\",\"Yes\""+ "," + "\""+quantity +"\""+ "," + "\""+ buyDateStr
                    +"\""+ "," + "\""+ sellDateStr +"\""+ "," + "\""+ buyRate +"\""+ "," + "\""+ sellRate+"\"";
            System.out.println(mtrString);
        }
    }

}

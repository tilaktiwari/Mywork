package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    //Dynamic Relative path
    public static final String FILE_PATH = "../homePractice/DataTest/PNT.xlsx";//coping path from project name and datatest directory
    // which is ../ putting it before the path name and adding "PNT.xlsx" at the end the path for putting xl exe

    public static void main(String[] args) {
        writeExcel();
    }

    public static void writeExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Student Details");
        Object[][] stDetails = {
                {"Sl", "First Name", "Last Name", "Address"},
                {"101", "Ram ", "Tiwari", "Centerville"},
                {"102", "Hari", "Tiwari", "Nepal"},
                {"103", "Ramji", "Pariyar", "Falls Church"},
                {"104", "Tilak", "Tiwari", "Reston"},
                {"105", "Deepak", "Sapkota", "Woodbridge"}//do not need to put coma unless adding more row


        };
        int rowNum = 0;
        System.out.println("Excel File Created");
        for (Object[] std : stDetails) {//converting two d array to one d array
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : std) {// converting one d array
                Cell cell = row.createCell(colNum++);// creating cell inside row to move in next cell
                if (field instanceof String) {
                    cell.setCellValue((String) field);//converting field object data type to String data type(casting)
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(FILE_PATH);
            workbook.write(out);
            workbook.close();
        } catch (FileNotFoundException fn) {
            System.out.println("File not found Exception");
        } catch (IOException io) {//input output exception
            System.out.println("Done");
        }
    }
}
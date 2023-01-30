package utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private String excelPath;
    private XSSFSheet sheet;
    private XSSFWorkbook book;
    private String sheetName;

    public ExcelReader(String excelPath, String sheetName) throws IOException {
        this.excelPath = excelPath;
        this.sheetName = sheetName;
        File file = new File(excelPath);
        FileInputStream fileInputStream = new FileInputStream(file);
        book = new XSSFWorkbook(fileInputStream);
        sheet = book.getSheet(sheetName);
    }

    private String cellToString(XSSFCell cell) throws Exception {
        Object cellContent = null;
        CellType cellType = cell.getCellType();
        switch (cellType){
            case STRING:
                cellContent = cell.getStringCellValue();
                break;
            case NUMERIC:
                cellContent = cell.getNumericCellValue();
                break;
            case BLANK:
                cellContent = "";
                break;
            default: throw new Exception("Ошибка чтения ячейки");

        }
        return cellContent.toString();
    }

    private int countColumns(){
        return sheet.getRow(0).getLastCellNum();
    }

    private int countRows(){
        return  sheet.getLastRowNum()+1;
    }

    public String[][] getParametersFromExel() throws Exception {
        File file = new File(excelPath);
        FileInputStream fileInputStream = new FileInputStream(file);
        book = new XSSFWorkbook(fileInputStream);
        sheet = book.getSheet(sheetName);
        int numberOfColumn = countColumns();
        int numberOfRows = countRows();
        String[][] data = new String[numberOfRows-1][numberOfColumn];
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                XSSFRow row = sheet.getRow(i);
                XSSFCell cell = row.getCell(j);
                String value = cellToString(cell);
                data[i-1][j] = value;

            }

        }
        return data;
    }
}

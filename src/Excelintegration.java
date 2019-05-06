import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class Excelintegration {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File fs = new File("D:\\excel to be read\\excelread.xlsm");
		
		FileInputStream fis = new FileInputStream(fs);
		
		XSSFWorkbook xls = new XSSFWorkbook(fis);
		
		XSSFSheet x1 = xls.getSheetAt(0);
		int i = x1.getLastRowNum();
		
	while(x1.getRow(i).getCell(1).toString().equals(""))
	{
		i--;
		
	}
			System.out.println(i);
			String s= x1.getRow(i).getCell(1).toString();
			System.out.println(s);
		
			//System.out.println(x1.getRow(i).getCell(0).getStringCellValue()+ "===>"+);
			
		}
		
		
		
		
	}



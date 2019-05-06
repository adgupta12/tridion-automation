import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile {



	public static void main(String[] args) throws Throwable {
		
		String str = readexcel();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\config\\Config1.txt")))
		{
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
String test,t;
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    //System.out.println(everything); 
		    
		    String str1[] = everything.split("LIBSESOLSYS_17R2_");
		    //System.out.println(str1[0]);
		    //System.out.println(str1[1]);
		    String str2[] = str1[1].split(".exe");
		    System.out.println(str2[0]);
		   
		    
		    
		    String str3[] = str.split("_17R2_");
		    System.out.println(str3[1]);
		    String str4[] = str3[1].split(".exe");
		    System.out.println(str4[0]);
		    
		    String notepad = str2[0];
		    String excel = str4[0];
		    if(!(notepad.equals(excel))){
		     test = excel +	".exe" + str2[1] ;
		     //System.out.println(test);
		     t = str1[0]+ "LIBSESOLSYS_17R2_" + test;
		     System.out.println(t);
		     FileWriter fr=new FileWriter("D:\\Cachebuster\\write.txt");
			
				BufferedWriter br1=new BufferedWriter(fr);

				br1.write(t);
				br1.close();
		    }
		    
		}

		}


	
	public static String readexcel() throws Throwable{
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
			return s;
		
			//System.out.println(x1.getRow(i).getCell(0).getStringCellValue()+ "===>"+);
			
		}
		
		
		
		
	}




		




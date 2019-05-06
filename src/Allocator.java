import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;


public class Allocator 
{

    static PrintWriter pw;
    static StringBuilder sb;
	/**
	 * @param args
	 * @throws Exception 
	 */
	
	public static void main(String args[]) throws Exception {
	

		
		//Errorlog object = new Errorlog();
		//object.prodissue(driver,"http://www.ocr.org.uk/qualifications/gcse/food-preparation-and-nutrition-j309-from-2016/assessment/");

		//Buisenesscomponent obj1 = new Buisenesscomponent();
		//obj1.fn_jira(driver);
		//Findacentr o1 = new Findacentr();
		//o1.findacentre(driver);
		//selection o2 = new selection();
		//o2.select(driver);
		//o1.link(driver);
		//publishcomponent obj2 = new publishcomponent();
		//o1.clickelement(driver);
		//obj2.fn_publish(driver);
		//Changefindac ob3= new Changefindac();
		//ob3.fndacntr(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\ltchrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sdswpap004/SDL/#app=wcm&entry=home");
        
        Editcomponent obj = new Editcomponent();
        //Editjs j1 = new Editjs();
       
		
	
       //j1.fn_editca(driver,2);
        
       //j1.fn_editca(driver, 3);
        obj.search(driver);
        //System.out.println("DONE"); 

	
	
	     
	

		
		
	}

}


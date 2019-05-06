import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Editjs {
	
	public void fn_editats(WebDriver driver, int f) throws Exception{
		
			driver.get("http://sdswpap004/SDL/");
			driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
			java.util.List<WebElement> clickEt = driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-17-1')]//div[contains(@title,'300 ATST Design')]"));
			clickEt.get(1).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
			Actions ab = new Actions(driver);
			WebElement x= driver.findElement(By.xpath("//*[@id='item_tcm:17-89-2']/td[2]"));
			ab.doubleClick(x).perform();
			WebElement y= driver.findElement(By.xpath("//*[@id='item_tcm:17-20834-2']/td[2]"));
			ab.doubleClick(y).perform();
			WebElement z = driver.findElement(By.xpath("//*[@id='item_tcm:17-20852-2']/td[2]"));
			ab.doubleClick(z).perform();
			
			WebElement a = driver.findElement(By.xpath("//*[@id='item_tcm:17-20876-2']/td[2]"));
			ab.doubleClick(a).perform();	
			
			WebElement h =driver.findElement(By.xpath("//*[@id='item_tcm:17-20909-2']/td[2]"));
			ab.doubleClick(h).perform();
			WebElement j= driver.findElement(By.xpath("//*[@id='item_tcm:17-20913-2']/td[2]"));
			ab.doubleClick(j).perform();
			String elementjs = "//*[@id='item_tcm:17-169164-2048']/td[2]";
			String elementcss = "//*[@id='item_tcm:17-169165-2048']/td[2]";
			if(f==3)
			{
			       
			 fn_editjscss(driver, elementcss, 2);
			 Thread.sleep(2000);
			 fn_editjscss(driver, elementjs, 1);     
			}
			else if(f==2) 
			       fn_editjscss(driver, elementcss, 2);
			else
			       fn_editjscss(driver, elementjs, 1);
	
		
		
		
		
	}
	

	public void fn_editca(WebDriver driver,int f)throws Exception{
		
		
			
				driver.get("http://sdswpap004/SDL/");
				driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
				
				
			java.util.List<WebElement> lst= driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-22-1')]//div[contains(@title,'300 CA Design')]"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			 jse.executeScript("arguments[0].scrollIntoView()", lst.get(1));
				lst.get(1).click();
				
				driver.switchTo().defaultContent();
				//Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
				//Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
				//Thread.sleep(1000);
				WebElement k = driver.findElement(By.xpath("//*[@id='item_tcm:22-89-2']/td[2]/div"));
				Actions abc = new Actions(driver);
				abc.doubleClick(k).perform();

				WebElement l = driver.findElement(By.xpath("//*[@id='item_tcm:22-20834-2']/td[2]"));
				abc.doubleClick(l).perform();
				WebElement m = driver.findElement(By.xpath("//*[@id='item_tcm:22-20852-2']/td[2]"));
				abc.doubleClick(m).perform();
				Thread.sleep(1000);
				
				//abc.contextClick(driver.findElement(By.xpath("/html/body"))).perform();
				
				WebElement n = driver.findElement(By.xpath("//*[@id='item_tcm:22-20876-2']"));
				
				abc.doubleClick(n).perform();
				Thread.sleep(1000);
				WebElement o = driver.findElement(By.xpath("//*[@id='item_tcm:22-20909-2']/td[2]"));
				abc.doubleClick(o).perform();
				WebElement p = driver.findElement(By.xpath("//*[@id='item_tcm:22-20913-2']/td[2]"));
				abc.doubleClick(p).perform();
				String elementjs ="//*[@id='item_tcm:22-169164-2048']/td[2]";
				String elementcss = "//*[@id='item_tcm:22-169165-2048']/td[2]";
				if(f==3)
				{
				       
				 fn_editjscss(driver, elementcss, 2);
				 Thread.sleep(2000);
				 fn_editjscss(driver, elementjs, 1);     
				}
				else if(f==2) 
				       fn_editjscss(driver, elementcss, 2);
				else
				       fn_editjscss(driver, elementjs, 1);
			

		
		
	}


public void fn_editocr(WebDriver driver,int f) throws UnsupportedFlavorException, Exception, IOException{
	
	
		driver.get("http://sdswpap004/SDL/");
		driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
		java.util.List<WebElement> lst= driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-28-1')]//div[contains(@title,'300 OCR Design')]"));
		lst.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
		Actions dblclk = new Actions(driver);
		WebElement el = driver.findElement(By.xpath("//*[@id='item_tcm:28-89-2']/td[2]"));
		dblclk.doubleClick(el).perform();
		WebElement el2 = driver.findElement(By.xpath("//*[@id='item_tcm:28-20834-2']/td[2]"));
		dblclk.doubleClick(el2).perform();
		WebElement el3= driver.findElement(By.xpath("//*[@id='item_tcm:28-20852-2']/td[2]"));
		dblclk.doubleClick(el3).perform();
		WebElement el4 = driver.findElement(By.xpath("//*[@id='item_tcm:28-20876-2']/td[2]"));
		dblclk.doubleClick(el4).perform();
		WebElement el5 = driver.findElement(By.xpath("//*[@id='item_tcm:28-20909-2']/td[2]"));
		dblclk.doubleClick(el5).perform();
		WebElement el6 = driver.findElement(By.xpath("//*[@id='item_tcm:28-20913-2']/td[2]"));
		dblclk.doubleClick(el6).perform();
		String elementjs="//*[@id='item_tcm:28-169164-2048']";
		String elementcss="//*[@id='item_tcm:28-169165-2048']";
		if(f==3)
		{
		       
		 fn_editjscss(driver, elementcss, 2);
		 Thread.sleep(2000);
		 fn_editjscss(driver, elementjs, 1);     
		}
		else if(f==2) 
		       fn_editjscss(driver, elementcss, 2);
		else
		       fn_editjscss(driver, elementjs, 1);
	
	


	
}
public void fn_editcie(WebDriver driver,int f)throws Exception{
	driver.get("http://sdswpap004/SDL/");
	driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
	java.util.List<WebElement> lst= driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-24-1')]//div[contains(@title,'300 CIE Design')]"));
	lst.get(1).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
	Actions dblclk = new Actions(driver);
	WebElement el = driver.findElement(By.xpath("//*[@id='item_tcm:24-89-2']/td[2]"));
	
	dblclk.doubleClick(el).perform();
	WebElement el2 = driver.findElement(By.xpath("//*[@id='item_tcm:24-20834-2']/td[2]"));
	dblclk.doubleClick(el2).perform();
	
	WebElement el3= driver.findElement(By.xpath("//*[@id='item_tcm:24-20852-2']/td[2]"));
	dblclk.doubleClick(el3).perform();
	
	WebElement el4 = driver.findElement(By.xpath("//*[@id='item_tcm:24-20876-2']/td[2]"));
	dblclk.doubleClick(el4).perform();
	WebElement el5 = driver.findElement(By.xpath("//*[@id='item_tcm:24-20909-2']/td[2]"));
	dblclk.doubleClick(el5).perform();
	WebElement el6 = driver.findElement(By.xpath("//*[@id='item_tcm:24-20913-2']/td[2]"));
	dblclk.doubleClick(el6).perform();
	String elementjs = "//*[@id='item_tcm:24-169164-2048']/td[2]";
	String elementcss = "//*[@id='item_tcm:24-169165-2048']/td[2]";
	if(f==3)
	{
	       
	 fn_editjscss(driver, elementcss, 2);
	 Thread.sleep(2000);
	 fn_editjscss(driver, elementjs, 1);     
	}
	else if(f==2) 
	       fn_editjscss(driver, elementcss, 2);
	else
	       fn_editjscss(driver, elementjs, 1);


}
public void fn_editcam(WebDriver driver,int f)throws Exception{
	driver.get("http://sdswpap004/SDL/");
	driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
	java.util.List<WebElement> lst= driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-117-1')]//div[contains(@title,'300 CAM MATHS Design')]"));
	lst.get(1).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
	Actions dblclk = new Actions(driver);
	WebElement el = driver.findElement(By.xpath("//*[@id='item_tcm:117-89-2']/td[2]"));
	
	dblclk.doubleClick(el).perform();
	WebElement el2 = driver.findElement(By.xpath("//*[@id='item_tcm:117-20834-2']/td[2]"));
	dblclk.doubleClick(el2).perform();
	
	
	WebElement el3= driver.findElement(By.xpath("//*[@id='item_tcm:117-20852-2']/td[2]"));
	dblclk.doubleClick(el3).perform();
	
	WebElement el4 = driver.findElement(By.xpath("//*[@id='item_tcm:117-20876-2']/td[2]"));
	dblclk.doubleClick(el4).perform();
	WebElement el5 = driver.findElement(By.xpath("//*[@id='item_tcm:117-20909-2']/td[2]"));
	dblclk.doubleClick(el5).perform();
	WebElement el6 = driver.findElement(By.xpath("//*[@id='item_tcm:117-20913-2']/td[2]"));
	dblclk.doubleClick(el6).perform();
	String elementjs = "//*[@id='item_tcm:117-169164-2048']/td[2]";
	String elementcss = "//*[@id='item_tcm:117-169165-2048']/td[2]";
	if(f==3)
	{
	       
	 fn_editjscss(driver, elementcss, 2);
	 Thread.sleep(2000);
	 fn_editjscss(driver, elementjs, 1);     
	}
	else if(f==2) 
	       fn_editjscss(driver, elementcss, 2);
	else
	       fn_editjscss(driver, elementjs, 1);
}

public void fn_editesol(WebDriver driver,int f)throws Exception{
	driver.get("http://sdswpap004/SDL/");
	driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='DashboardTree']/iframe")));
	java.util.List<WebElement> lst= driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-26-1')]//div[contains(@title,'300 ESOL Design')]"));
	lst.get(1).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
	Actions dblclk = new Actions(driver);
	WebElement el = driver.findElement(By.xpath("//*[@id='item_tcm:26-89-2']/td[2]"));
	
	dblclk.doubleClick(el).perform();
	WebElement el2 = driver.findElement(By.xpath("//*[@id='item_tcm:26-20834-2']/td[2]"));
	dblclk.doubleClick(el2).perform();
	
	
	WebElement el3= driver.findElement(By.xpath("//*[@id='item_tcm:26-20852-2']/td[2]"));
	dblclk.doubleClick(el3).perform();
	
	WebElement el4 = driver.findElement(By.xpath("//*[@id='item_tcm:26-20876-2']/td[2]"));
	dblclk.doubleClick(el4).perform();
	WebElement el5 = driver.findElement(By.xpath("//*[@id='item_tcm:26-20909-2']/td[2]"));
	dblclk.doubleClick(el5).perform();
	WebElement el6 = driver.findElement(By.xpath("//*[@id='item_tcm:26-20913-2']/td[2]"));
	dblclk.doubleClick(el6).perform();
	String elementjs = "//*[@id='item_tcm:26-169164-2048']/td[2]";
	String elementcss = "//*[@id='item_tcm:26-169165-2048']/td[2]";
	if(f==3)
	{
	       
	 fn_editjscss(driver, elementcss, 2);
	 Thread.sleep(2000);
	 fn_editjscss(driver, elementjs, 1);     
	}
	else if(f==2) 
	       fn_editjscss(driver, elementcss, 2);
	else
	       fn_editjscss(driver, elementjs, 1);
}

public static void fn_editjscss(WebDriver driver,String xpath, int flag) throws Exception{
	Actions ab = new Actions(driver);
	WebElement l = driver.findElement(By.xpath(xpath));
	ab.doubleClick(l).perform();
	ArrayList<String> str =new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(str.get(1));
	Thread.sleep(1000);
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[1]/div[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	String datarecord = (String) clipboard.getData(DataFlavor.stringFlavor);
	
	if (datarecord.contains("Loading")){	
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
		
		datarecord = (String) clipboard.getData(DataFlavor.stringFlavor);
		System.out.println("String from Clipboard: ATST" + datarecord);
		
	}
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).clear();
	String str12 =cachebuster.fn_call(datarecord,flag); 
	StringSelection selection = new StringSelection(str12);
     clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(selection, selection);
    driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	//driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div[2]/div[2]/textarea")).sendKeys(str12);
	driver.findElement(By.xpath("//*[@id='SaveCloseBtn']/div[2]")).click();
	ArrayList<String> str1 =new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(str1.get(0));
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
  
    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='FilteredItemsList_frame_details']")));
}
}

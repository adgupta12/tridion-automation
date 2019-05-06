import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Editcomponent {
	
	Data obj2= new Data();
	
	public void frameswitch(WebDriver driver,String uniquexpath) throws InterruptedException
    {
           driver.switchTo().frame(driver.findElement(By.xpath(uniquexpath)));
           //Thread.sleep(1500);
    }      

// Edit component//
    public void prodcms(WebDriver driver) throws InterruptedException, AWTException   
    {
           

           
           
           //Thread.sleep(1500);
           //utility.takescreenshot(driver, "1st Screenshot");
           driver.findElement(By.xpath(".//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
           //reports.log(LogStatus.PASS, "Content Explorer Clicked");
           
           
           //Thread.sleep(1000);
           
           frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
           frameswitch(driver,"//*[@id='DashboardTree']/iframe");
           
           // Only Input Required 
           driver.findElement(By.xpath("//div[contains(@title,'400 OCR Website (tcm:0-33-1)')]")).click();
           
           
           
           
           for(int i = 0; i < obj2.str.length ; i++)
           {
                 try
                 {
           
           driver.switchTo().defaultContent();
           frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
           frameswitch(driver,"//*[@id='views_container_frame_2']");
           
           //Thread.sleep(2000);
           
           driver.findElement(By.xpath("//*[@id='BarSearchKeyword']")).click();
           //Thread.sleep(2000);
           
           driver.findElement(By.xpath("//*[@id='BarSearchKeyword']")).sendKeys(obj2.str[i]);
           driver.findElement(By.xpath("//*[@id='BarSearchBtn']")).click();
           //Thread.sleep(1000);
           driver.switchTo().defaultContent();
           frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
           frameswitch(driver,"//*[@id='DashboardView']/body/iframe");
           
           //Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='BtnOk']")).click();
           //*[@id="BtnOk"]
           //Thread.sleep(1000);
           ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
           driver.switchTo().window(tabs2.get(1));
           //Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='MetadataTab_switch']")).click();
           //Thread.sleep(1000);
           String text = driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).getAttribute("value");
           System.out.println(text);
           //Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).clear();
           driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).sendKeys(" ");
           driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).clear();
           driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).sendKeys(text);
           //Thread.sleep(1000);
           driver.findElement(By.xpath("//*[@id='SaveCloseBtn']")).click();
           //*[@id="ItemMetadata"]/div/div[1]/div/input
           
           
           ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
           
           
           //driver.switchTo().window(tabs3.get(1));
           //driver.close();
           driver.switchTo().window(tabs3.get(0));
           
           
           driver.switchTo().defaultContent();
           frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
           frameswitch(driver,"//*[@id='views_container_frame_2']");
           driver.findElement(By.xpath("//*[@id='BarSearchKeyword']")).clear();
           System.out.println("Edited for " + obj2.str[i]);
                 }
                 catch(Exception e)
                 {
                        
                               System.out.println("Exception occur at " + obj2.str[i]+e.getMessage());
                               
                 }
    
    }
           

    }
    public void search(WebDriver driver) throws InterruptedException
    {
           
    
    // TODO Auto-generated method stub
                  //Thread.sleep(1500);
                  //utility.takescreenshot(driver, "1st Screenshot");
                  driver.findElement(By.xpath(".//*[@id='main-view-target']/div/div[2]/div[2]/div[2]/div[2]/ul/li/ul/li[3]/span[2]")).click();
                  //reports.log(LogStatus.PASS, "Content Explorer Clicked");
                  
                  
                  //Thread.sleep(1000);
                  
                  frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
                  frameswitch(driver,"//*[@id='DashboardTree']/iframe");
                  
                  // Only Input Required 
                  driver.findElement(By.xpath("//div[contains(@title,'400 OCR Website (tcm:0-33-1)')]")).click();
                  
                  //java.util.List<WebElement> clickEt = driver.findElements(By.xpath("//div[contains(@id,'node_tcm:0-138-1')]//div[contains(@title,'150 Schema Master - CIE Teacher Support')]"));
                  //clickEt.get(1).click();
                  
                  
                  for(int i = 0; i < obj2.str.length ; i++)
                  {
                  try
                  {
                  //reports.log(LogStatus.PASS, "300 CAM Maths clicked");
                  //utility.takescreenshot(driver, "3rd Screenshot");
                  driver.switchTo().defaultContent();
                  frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
                  frameswitch(driver,"//*[@id='views_container_frame_2']");
                  driver.findElement(By.xpath("//*[@id='BarSearchKeyword']")).sendKeys(obj2.str[i]);
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='BarSearchBtn']")).click();
                  Thread.sleep(1000);
                  driver.switchTo().defaultContent();
                  frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
                  frameswitch(driver,"//*[@id='DashboardView']/body/iframe");
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='openreadonly']")).click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='BtnOk']")).click();
                  //*[@id="BtnOk"]
                  Thread.sleep(1000);
                  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
                  driver.switchTo().window(tabs2.get(1));
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='PublishBtn']")).click();
                  Thread.sleep(2000);
                  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
                  System.out.println(i);
                  driver.switchTo().window(tabs.get(2));
                 /* if(i==0)
                  {
                  Thread.sleep(2000);
                  frameswitch(driver,"//*[@id='TargetTypeList_frame_details']");
                  //driver.findElement(By.xpath("html/body/table/tbody/tr[7]/td[1]/input")).click();
                  driver.findElement(By.xpath("//*[@id='item_tcm:0-16-65538']/td[1]/input")).click();
                  driver.switchTo().defaultContent();
                  }*/
                  Thread.sleep(500);
                  driver.findElement(By.xpath("//*[@id='BtnPublish']/span")).click();
                  //Thread.sleep(2000);
                  ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
                  
                  
                  driver.switchTo().window(tabs3.get(1));
                  driver.close();
                  driver.switchTo().window(tabs3.get(0));
                  
                  
                  driver.switchTo().defaultContent();
                  frameswitch(driver,"//*[@id='main-view-target']/div/div[1]/div[5]/div/iframe");
                  frameswitch(driver,"//*[@id='views_container_frame_2']");
                  driver.findElement(By.xpath("//*[@id='BarSearchKeyword']")).clear();
                  System.out.println("Publishing done for" + obj2.str[i]);
                  }
                  catch(Exception e)
                  {
                        System.out.println("Exception occur at " + obj2.str[i]);
                  }
                  }
    }
}
           


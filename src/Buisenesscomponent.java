

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;





public class Buisenesscomponent  {
	
	PageObject p1 = new PageObject();
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	private boolean existsElement(WebDriver driver,String id) {
	    try {
	        driver.findElement(By.id(id));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
	

	
	public void fn_ads(WebDriver driver, String id, String id2) throws InterruptedException, AWTException{
		driver.switchTo().frame(driver.findElement(By.id(id)));
		Thread.sleep(2000);
		WebElement x= driver.findElement(By.id(id2));
		x.click();
		Thread.sleep(2000);
	
		
	}

		/*public void fn_goibibo(WebDriver dr) throws InterruptedException{
			try{ if(existsElement(dr,p1.ids)== Boolean.TRUE)
			{
				fn_ads(dr,p1.ids,p1.ids1);
			}
			Element.byXpath(dr, p1.xpth).sendKeys(p1.fromdest);
			
			Thread.sleep(1000);
			
			if(existsElement(dr,p1.ids)== Boolean.TRUE)
			{
				fn_ads(dr,p1.ids,p1.ids1);
			}
		
			Element.byXpath(dr, p1.xpth2).sendKeys(p1.todest);
			Thread.sleep(1000);
			
			if(existsElement(dr,p1.ids)== Boolean.TRUE)
			{
				fn_ads(dr,p1.ids,p1.ids1);
			}
			dr.findElement(By.xpath(p1.xpth3)).click();
			Thread.sleep(1000);
			if(existsElement(dr,p1.ids)== Boolean.TRUE)
			{
				fn_ads(dr,p1.ids,p1.ids1);
			}
			Element.byCssSelector(dr, p1.cssselectr).click();
			
			Thread.sleep(1000);
			Element.byId(dr, p1.idx).click();
			//dr.findElement(By.xpath(p1.xpth4)).click();
			Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("The error is " + ""  + e );
			}
			
			
		}*/
		
		public void fn_jira(WebDriver dr2) throws InterruptedException{
			try{
				dr2.get(p1.appURL);
				dr2.manage().window().maximize();
				dr2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Thread.sleep(2000);
				
				Element.byId(dr2, p1.juid).sendKeys(p1.jid);
				Element.byId(dr2, p1.jupwd).sendKeys(p1.pswdjra);
				///Thread.sleep(2000);
				Element.byId(dr2, p1.lbutton).click();
				//Thread.sleep(2000);
				Element.byXpath(dr2, p1.closemenu).click();
				//Thread.sleep(1000);
				Element.byXpath(dr2, p1.createissue).click();
				//Thread.sleep(1000);
				dr2.switchTo().activeElement();
				//Thread.sleep(1000);
				Element.byXpath(dr2, p1.issuetype).sendKeys(p1.bug);
				//Thread.sleep(2000);
				Element.byId(dr2, p1.isummary).click();
				//Thread.sleep(1000);
			    Element.byId(dr2, p1.isummary).sendKeys(p1.isummtext);
			    //Thread.sleep(1000);
			    Element.byId(dr2, p1.idesc).sendKeys(p1.isummtext);
			    //Thread.sleep(1000);
			   
			  
			    
			   
			    Element.byId(dr2, p1.businessstream).click();
			    Thread.sleep(1000);
			   
			    
			   Thread.sleep(2000);
			    dr2.quit();
			    
			   
			}
			catch(Exception e){
				System.out.println("The error message is" + e);
			}

		}
		
		
		}
		

	


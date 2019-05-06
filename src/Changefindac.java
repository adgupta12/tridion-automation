import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Changefindac {

	public void fndacntr(WebDriver dr){
		try{
			
			dr.get("http://stgtest.atst.ucles.internal/find-a-centre/");
			dr.manage().window().maximize();
		
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("arguments[0].scrollIntoView()", dr.findElement(By.xpath("//*[@id='SelectedRegionId']")));
			Select dropdown= new Select(dr.findElement(By.xpath("//*[@id='SelectedRegionId']")));
			
			Select dropdown2= new Select(dr.findElement(By.xpath("//*[@id='SelectedAchievableFamilyId']")));
			java.util.List<WebElement> elements = dropdown.getOptions();
			java.util.List<WebElement> element1= dropdown2.getOptions();
			
			for(int j=0;j<elements.size();j++){
				System.out.println(elements.get(j).getText());
				Thread.sleep(1000);
			dropdown.selectByVisibleText(elements.get(j).getText());
			for(int k=0;k<element1.size();k++){
				System.out.println(element1.get(k).getText());
				Thread.sleep(1000);
			
				dropdown.selectByVisibleText(elements.get(k+1).getText());
				dr.findElement(By.xpath("//form/main/div/div/div/div/div/div/div/div[2]/div/fieldset/p[3]/input")).click();
				
				
			
		    Thread.sleep(2000);
	        java.util.List<WebElement> table = dr.findElements(By.linkText("Contact details"));
			    
		     
			    for(int i=0;i<table.size();i++){
			    	
			    	java.util.List<WebElement> t = dr.findElements(By.linkText("Contact details"));
			        t.get(i).click();
			       
			        Thread.sleep(2000);
			        try
			        {
			        
			        WebElement el1= dr.findElement(By.xpath("//a[contains(@href,'/BMAT–October')][text()='BMAT – October']"));
			        if(el1.isDisplayed()==Boolean.TRUE){
			            //el1.sendKeys(Keys.CONTROL +"t");
			           System.out.println("Pass");
			        
			        
			        }
			        }
			       
			       
			        catch(Exception e)
			       {
			          System.out.println("BMAT link not found"); 
			       }
			              
			       
			        dr.findElement(By.xpath("//form/main/div/div/div/div/div/div/div/div[2]/div/fieldset/p[3]/input")).click();
			        Thread.sleep(3000);
			      

			    	}
				}
		    

		
		    	
		    
		   
		}
		}
		
		    
		    catch(Exception e){
		    	System.out.println("The error caught is" + e);
		    }
		    
			}
	}



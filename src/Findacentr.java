import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Findacentr {
	
	
	public void findacentre(WebDriver dr){
		try{
			dr.get("http://dev-www.admissionstestingservice.org/find-a-centre/");
			dr.manage().window().maximize();
		
			
			
		//	java.util.List<WebElement> elements = dropdown.getOptions();
	//		java.util.List<WebElement> element1= dropdown2.getOptions();
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("arguments[0].scrollIntoView()", dr.findElement(By.xpath("//*[@id='SelectedRegionId']")));
			
			Select dropdownlist= new Select(dr.findElement(By.xpath("//*[@id='SelectedRegionId']")));
			 java.util.List<WebElement> drpdwnsize = dropdownlist.getOptions();
			  Select dropdown2= new Select(dr.findElement(By.xpath("//*[@id='SelectedAchievableFamilyId']")));
			 for(int j=0;j<drpdwnsize.size();j++){
				
				//Select dropdown= new Select(dr.findElement(By.xpath("//*[@id='SelectedRegionId']")));
	  		  
	  		    //java.util.List<WebElement> elements = dropdown.getOptions();
			
			System.out.println(drpdwnsize.size());
			System.out.println(drpdwnsize.get(j).getText());
				Thread.sleep(1000);
				dropdownlist.selectByIndex(j);	
		//	dropdown.selectByValue(elements.get(j).toString());
			dropdown2.selectByValue("8906495");
		    dr.findElement(By.id("search")).click();
		    Thread.sleep(2000);
		    
	        java.util.List<WebElement> table = dr.findElements(By.linkText("Contact details"));
			  
			  if(table.isEmpty()){
				  System.out.println("Contact details not found");
			  }
			  else{
			    for(int i=0;i<table.size();i++){
			    	
			        java.util.List<WebElement> t = dr.findElements(By.linkText("Contact details")); 
			        t.get(i).click();
			       
			        Thread.sleep(2000);
			        
			        try
			        {
			        
			        WebElement el1= dr.findElement(By.xpath("//a[contains(@href,'/BMAT–October')][text()='BMAT – October']"));
			        if(el1.isDisplayed()==Boolean.TRUE){
			            //el1.sendKeys(Keys.CONTROL +"t");
			            el1.click();
			            
			            //ArrayList<String> tabs = new ArrayList<String> (dr.getWindowHandles());
			            //dr.switchTo().window(tabs.get(1));
			            //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        	
					       String head = dr.findElement(By.xpath("//*[@id='content_subheader']/h1")).getText();
					       if(head.contains("Error")){
					    	   System.out.println("||||Validation failed|||"+"|||For|||");
					       }
					       else{
					    	   System.out.println("|||Validation 2 in SYS"+"Pass");;
					       }
				
					        
			        
			              
			        }
				       
		
			        
			      

			    	}
			       
				       
			        catch(Exception e)
			       {
			          System.out.println("BMAT link not found"); 
			       }
			          
			           dr.navigate().back();
				       Thread.sleep(5000);
				       dr.findElement(By.xpath("//form/main/div/div/div/div/div/div/div/div[2]/div/fieldset/p[3]/input")).click();
					   Thread.sleep(2000);
			
				    
			    
			    }
			    
			      
		
			  }
			      
			       
			}
			
		}
		
		    
		    catch(Exception e){
		    	System.out.println("The error caught is" + e);
		    }
		    
			}
	public void clickelement(WebDriver dr) throws InterruptedException
	{
		try
		{
		dr.get("http://stgtest.cie.ucles.internal/i-want-to/find-a-cambridge-school/");
        dr.manage().window().maximize();
        Thread.sleep(1000);
        dr.findElement(By.xpath("//*[@id='ctl00']/div[5]/a")).click();
     
        Select dropdown = new Select(dr.findElement(By.xpath(" //*[@id='SelectedRegionId']")));
        
        java.util.List<WebElement> elements = dropdown.getOptions();
        //System.out.println(elements.get(40).getText());
        for(int i = 0;i < 63;i++)
        {
              dropdown.selectByVisibleText(elements.get(i).getText());
              System.out.println(i+".|||"+elements.get(i).getText()+"|||");
              
              Thread.sleep(20000);
              Select city = new Select(dr.findElement(By.xpath("//*[@id='SelectedCity']")));
            
              java.util.List<WebElement> citylist = city.getOptions();
            	int noofcity = citylist.size();
            	if(noofcity > 1)
            	{
            		for(int j = 1 ;j < citylist.size();j++)
            		{
                     
                     city.selectByValue(citylist.get(j).getText());
                     System.out.println("'"+citylist.get(j).getText()+"'");
                     Thread.sleep(4000);
                     dr.findElement(By.xpath("//*[@id='search']")).click();
                     Thread.sleep(2000);
                     	try
                     	{
                     
                     		java.util.List<WebElement> table = dr.findElements(By.xpath("//*[@title='website']"));
                     
                     
                     			if(table.size()>0)
                     			{
                     					for(int k=0;k<table.size();k++)
                     					{
                     						//System.out.println(table.get(i).getText());
                     						if(table.get(k).getText().contains("http://") )
                                                System.out.println(table.get(k).getText() + " = " + "Pass");
                     						else if(table.get(k).getText().contains(""))
                                                System.out.println(" Website field is blank : Fail");
                     						else if(table.get(k).getText() == "http:\\")
                                                System.out.println(" Website field has reverse slash : Fail");
                     						else
                     							System.out.println(table.get(k).getText() + " = " + "Fail");
                     					}
                     			}
                     	}
                     	catch(Exception e)
                     	{
                           System.out.println("For City : "+citylist.get(j).getText() + " No website available.");
                           System.out.println(e.getMessage());
                     	}
            		}
              
            }
        }
		}
		catch(Exception e)
		{
			
		}
		
	}
	
              
}
        
              
              
		
	
	
	


		
	

	
	



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class selection {

	
	
public void select(WebDriver dri) throws InterruptedException{
	try{
	dri.get("http://stgtest.cie.ucles.internal/i-want-to/find-a-cambridge-school/");
	Thread.sleep(2000);
	dri.manage().window().maximize();
	Element.byXpath(dri, "//*[@id='ctl00']/div[5]/a").click();
	Thread.sleep(1000);
	
	Element.byId(dri, "SelectedRegionId").click();
	Thread.sleep(2000);
	Select dropdown = new Select(Element.byId(dri, "SelectedRegionId"));
	dropdown.selectByValue("Albania");
	
	java.util.List<WebElement> elements = dropdown.getOptions();
	
	for(int i=0;i<elements.size();i++){
		System.out.println(elements.get(i).getText());
		/*char ch,c;
		String str = elements.get(i).getText();
		for(int j = 0 ; j < str.length();j++)
		{
			if(j==0)
			{
				c=str.charAt(j);
				if (c >= 65 && c <=90)
				{
				 System.out.println(str+"["+j +"]"+ " :Pass");
				}
				else
					 System.out.println(j +":Fail for the element "+ str);
			}
			else
			{
				
			
				ch=str.charAt(j);
				if (ch >= 97 && ch <= 122)
				{
					System.out.println(str+"["+j +"]"+ " :Pass");
				}
				else
				{
					System.out.println(j +":Fail for the element "+ str);  
				}
		}*/
		}
		
	
	
	Thread.sleep(2000);
	Element.byId(dri, "SelectedCity").click();
	Thread.sleep(2000);
	Select dropdown2 = new Select(Element.byId(dri, "SelectedCity"));
	dropdown2.selectByValue("Tirana");
	Thread.sleep(2000);
	Element.byXpath(dri, "//*[@id='search']").click();
	Thread.sleep(2000);
	//dri.quit();
	}
	catch(Exception ex){
		System.out.println(ex);
	}
	
	
	
}
}

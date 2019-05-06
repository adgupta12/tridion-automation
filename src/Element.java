import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Element{

	/**
	 * @param args
	 */
	
	public static WebElement byXpath(WebDriver dr1,String str){
	
		return dr1.findElement(By.xpath(str));
	}
		
	public static WebElement byCssSelector(WebDriver dr1,String str2){
			
		return dr1.findElement(By.cssSelector(str2));
	}
			
	public static WebElement byId(WebDriver dr1,String str3){
				
		return dr1.findElement(By.id(str3));
	}
				
	public static WebElement byclassname(WebDriver dr1,String str4){
					
		return dr1.findElement(By.className(str4)); 
	}
		
	public static WebElement bylinkText(WebDriver dr1,String str5){
			return dr1.findElement(By.linkText(str5));
		}
				
	public static WebElement byName(WebDriver dr,String str){
		return dr.findElement(By.name(str));
	}
	
	public static void frameswitch(WebDriver dr, String str){
		
		dr.switchTo().frame(dr.findElement(By.xpath(str)));
	}
	
	public static void doubleClick(WebDriver dr, WebElement el){
		Actions act= new Actions(dr);
		act.doubleClick(el).perform();
	}
	
	public static void contextClick(WebDriver dr,WebElement el){
		Actions act= new Actions(dr);
		act.contextClick(el).perform();
	}
	



}
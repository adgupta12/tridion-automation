import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class publishcomponent {

	
	public void fn_publish(WebDriver driver) throws InterruptedException{
		try{
			
			driver.get("http://sdswpap004/SDL/#app=wcm&entry=home");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/input")).sendKeys("test");
			
			Thread.sleep(1000);
			/*driver.findElement(By.xpath("//*[@id='MetadataTab_switch']")).click();
			Thread.sleep(1000);
			String abc= driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).getAttribute("value");
			System.out.println(abc);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).clear();
			driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).sendKeys(abc + " ");
			driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).clear();
			driver.findElement(By.xpath("//*[@id='ItemMetadata']/div/div[1]/div/input")).sendKeys(abc);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='SaveCloseBtn']/div[1]")).click();*/
			
	}
		catch(Exception e){
			
		}
	}
	
}


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Business {

	public void fn_cookie(WebDriver driver) throws InterruptedException{
		try{
			
		driver.get("http://stgtest.esol.ucles.internal/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement cookie= driver.findElement(By.xpath("//*[@id='ctl00']/div[4]/a[2]"));
		
		cookie.click();
		Thread.sleep(2000);
		driver.manage().deleteCookieNamed("cookiePolicyTracker");
		driver.manage().deleteCookieNamed("cc_cookie_accept");
		Thread.sleep(2000);
		//driver.quit();
		
	}catch(Exception e){
		
	System.out.println("The error appearing in the flow is"+ " " + e);
		
	}
	
	}

}

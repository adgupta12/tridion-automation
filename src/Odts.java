import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Odts {
	WebDriver driver;
	
	public void fn_open(String str){
		driver.get(str);
		WebElement usid =driver.findElement(By.id("Username"));
		usid.clear();
		usid.sendKeys("islam.r@cambridgeassessment.org.uk");
		WebElement passwrd = driver.findElement(By.id("Password"));
		usid.clear();
		passwrd.sendKeys("An1ket");
	    driver.findElement(By.xpath("//*[@id='loginForm']/fieldset/div[1]/div[3]/input")).click();
	}

}

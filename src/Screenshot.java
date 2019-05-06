import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	
	public void fn_Screenshot(WebDriver driver,String str ) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcht = scrShot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(str);
		FileUtils.copyFile(srcht, dest);
	}

}

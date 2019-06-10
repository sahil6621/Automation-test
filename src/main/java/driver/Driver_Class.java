package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Class {

	public WebDriver driver;
	
	public void initialization(){
		
		selectbrowser("chrome");
	}
	
	public void selectbrowser(String browsername){
		
		switch(browsername){
		
		case "chrome":
			
			System.setProperty("WevDriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		case "firefox":
		}
	}
	
}

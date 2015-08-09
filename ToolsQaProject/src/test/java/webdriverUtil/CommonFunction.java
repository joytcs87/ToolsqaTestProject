package webdriverUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CommonFunction {
	 protected WebDriver driver;

	public  void setup(String browserName, String url){
		if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer64.exe");
			driver=new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}else{
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	 //This function will hover mouse to element
	 public void mouseHover(WebDriver driver, WebElement element){
		 Actions builder = new Actions(driver);
		 Action hover =builder.moveToElement(element).build();
		 hover.perform();
	 }
}

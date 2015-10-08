package webdriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	/**
	 * 
	 * @param rBtn
	 * @param option
	 * @return
	 */
	public static boolean selectRadioBtnByIndex(List<WebElement> rBtn, int option ){
		int rBtnSize=rBtn.size();
		try{
			if(rBtnSize <=0)
				throw new Exception("Radio button don't have any element");
			if(option >rBtnSize)
				throw new Exception("Option is out of range");
			if(option <= 0)
				throw new Exception("Option should be greater then 0");
			
			if(!rBtn.get(option - 1).isSelected())
				rBtn.get(option - 1).click();
		}catch (Exception e){
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param rBtn
	 * @param option
	 * @return
	 */
	public static boolean selectRadioBtnByValue(List<WebElement> rBtn, String option ){
		int rBtnSize=rBtn.size();
		String value;
		Boolean flag_found=false;
		for(int i=0;i<rBtnSize;i++){
			value=rBtn.get(i).getAttribute("value");
			if(value.equalsIgnoreCase(option)){
				rBtn.get(i).click();
				flag_found=true;
			}
		}
		if(flag_found)
			return true;
		else
			Reporter.log("Option is not found");
			return false;
	}
	
	
	
	/**
	 * 
	 * @param checkBox
	 * @param values
	 * @return
	 */
	public static boolean selectCheckBoxByValues(List<WebElement> checkBox, String... values){
		int checkBoxSize=checkBox.size();
		boolean select_flag=false;
		try{
			if(checkBox.isEmpty())
				throw new Exception("Check box is empty");
			if(values.length<=0)
				throw new Exception("Provide at least one value");
					else{
						for(String value : values){
							for(int i=0;i<checkBoxSize;i++){
								String checkBoxValue=checkBox.get(i).getAttribute("value");
								if(checkBoxValue.equalsIgnoreCase(value)){
									checkBox.get(i).click();
									select_flag=true;
								}
							}
						}							
					}		
				}catch(Exception e){
					Reporter.log(e.toString(),true);
					return false;
				}
		if(select_flag)
			return true;
		else
			return false;
	}
	
	 /**
	  * This function will hover mouse to element
	  * @param driver
	  * @param element
	  */
	
	 public void mouseHover(WebDriver driver, WebElement element){
		 Actions builder = new Actions(driver);
		 Action hover =builder.moveToElement(element).build();
		 hover.perform();
	 }
}

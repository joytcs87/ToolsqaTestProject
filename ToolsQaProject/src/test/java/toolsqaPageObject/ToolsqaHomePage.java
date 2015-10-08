package toolsqaPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	
	public class ToolsqaHomePage {
		
		//Identify all element in main navigation bar
		
		@FindBy(xpath="//ul[@id='main-nav']/li[1]/a/span[text()='HOME']")
		public WebElement home;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[2]/a/span[text()='Tutorials']")
		public WebElement tutorila;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[3]/a/span[text()='TRAININGS']")
		public WebElement trainings;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[4]/a/span[text()='FORUM']")
		public WebElement forum;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[5]/a/span[text()='VIDEOS']")
		public WebElement videos;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[7]/a/span[text()='ABOUT']")
		public WebElement about;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[8]/a/span[text()='CONTACTS']")
		public WebElement contacts;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/a/span[text()='DEMO SITES']")
		public WebElement demoSites;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[10]/a/span[text()='TESTIMONIALS']")
		public WebElement testimonials;
		
		//Identify all element in sub navigation for DEMO SITES
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[1]/a/span[contains(.,'E-Commerce')]")
		public WebElement eCommerceSite;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[2]/a/span[contains(.,'Basic Demo')]")
		public WebElement basicDemoSite;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[3]/a/span[contains(.,'Automation Practice')]")
		public WebElement automationPracticeForm;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[4]/a/span[contains(.,'Switch Windows')]")
		public WebElement switchWindows;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[5]/a/span[contains(.,'Table')]")
		public WebElement automationTable;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[6]/a/span[contains(.,'Alerts')]")
		public WebElement webdriverAlerts;
		
		@FindBy(xpath="//ul[@id='main-nav']/li[9]/ul[@class='sub-nav']/li[7]/a/span[contains(.,'IFrame')]")
		public WebElement IframePractice;
		

}

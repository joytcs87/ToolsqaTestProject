package com.toolsqa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import toolsqaPageObject.IFramePage;
import webdriverUtil.CommonFunction;

public class IFrameTest extends CommonFunction{
	
	IFramePage iFramePage;
	
	@Parameters ({"BrowserName", "Url"})
	@BeforeClass
	public void settingUp(String browserName,String url){
		setup(browserName,url);		
	}
	
	@Test
	public void iFrameTest(){
		
		iFramePage=PageFactory.initElements(driver, IFramePage.class);
		
		List<WebElement> iframes=iFramePage.iFrameElements;
		
		int noOfIFrame = iframes.size();
		Reporter.log("Total No of Iframe: "+noOfIFrame,true);
		
		for(int i=0;i<noOfIFrame;i++){
			Reporter.log("Frame ID: "+iframes.get(i).getAttribute("id")+"\t"+"Frame Name: "+iframes.get(i).getAttribute("name"),true);
		}
		
		driver.switchTo().frame(0);
		iFramePage.firstName.sendKeys("jayanta");
		iFramePage.lastName.sendKeys("Dey");
		Assert.assertTrue(selectRadioBtnByValue(iFramePage.sex, "Female"), 
				"Sex radio button is not selected");
		Reporter.log("Sex radio button is successfully selected",true);
		
		Assert.assertTrue(selectRadioBtnByValue(iFramePage.exp, "4"), 
				"Experience radio button is not selected");
		Reporter.log("Experience radio button is selected",true);
		
		Assert.assertTrue(selectCheckBoxByValues(iFramePage.profession, "Manual Tester",
				"Automation Tester"), "Profession check box is not selected");
		Reporter.log("Profession check box is successfully selected",true);
		
		Assert.assertTrue(selectCheckBoxByValues(iFramePage.tool, "Selenium Webdriver"), 
				"Tools check box is not selected successfuly");
		Reporter.log("Tools check box is successfully selected",true);
		
		Select selectContinent=new Select(iFramePage.continents);
		selectContinent.selectByVisibleText("Europe");
		Reporter.log("continents is selected successfully",true);
		
		Select seleniumCommand=new Select(iFramePage.seleniumCommand);
		seleniumCommand.selectByVisibleText("Wait Commands");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement entryContent = driver.findElement(By.className("entry-content"));
		List<WebElement> col_md_4 =entryContent.findElements(By.className("col-md-4"));
		Assert.assertTrue(col_md_4.get(0).findElement(By.tagName("h5")).getText().equals("Unique & Clean"),"Header is not correct");
		Reporter.log("Unique & Clean header is present",true);
		Assert.assertTrue(col_md_4.get(1).findElement(By.tagName("h5")).getText().equals("Customer Support"),"Header is not correct");
		Reporter.log("Customer Support header is present",true);
		Assert.assertTrue(col_md_4.get(2).findElement(By.tagName("h5")).getText().equals("Very Flexible"),"Header is not correct");
		Reporter.log("Very Flexible header is present",true);
		
		WebElement tab_ul = driver.findElement(By.id("tab_ul"));
		List <WebElement> allTab = tab_ul.findElements(By.tagName("li"));
		allTab.get(0).click();
		String tab1Content=driver.findElement(By.xpath("//div[@id='tabs-1']").tagName("b")).getText();
		Assert.assertTrue(tab1Content.equals("Content 1 Title"),"Tab 1 content is not ok");
		Reporter.log("Tab 1 content is ok",true);
		
		
		driver.switchTo().defaultContent();
		driver.close();
		
	}
}

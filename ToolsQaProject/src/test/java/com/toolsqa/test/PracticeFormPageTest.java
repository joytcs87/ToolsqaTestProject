package com.toolsqa.test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import toolsqaPageObject.AutomationPracticeFormPage;
import toolsqaPageObject.ToolsqaHomePage;
import webdriverUtil.CommonFunction;

public class PracticeFormPageTest extends CommonFunction{
	
	ToolsqaHomePage toolsqaHomePage;
	AutomationPracticeFormPage practiceFormPage;
	
	@Parameters ({"BrowserName", "Url"})
	@BeforeClass
	public void settingUp(String browserName,String url){
		setup(browserName,url);		
	}
	
	@Test
	public void practiceFormPageTest(){
		//toolsqaHomePage=PageFactory.initElements(driver, ToolsqaHomePage.class);
		//mouseHover(driver, toolsqaHomePage.demoSites);
		//toolsqaHomePage.automationPracticeForm.click();
		
		practiceFormPage=PageFactory.initElements(driver, AutomationPracticeFormPage.class);
		
		practiceFormPage.firstName.sendKeys("Jayanta");
		Reporter.log("First name entred",true);
		
		practiceFormPage.lastName.sendKeys("Dey");
		
		Assert.assertTrue(selectRadioBtnByValue(practiceFormPage.sex, "Female"), 
				"Sex radio button is not selected");
		Reporter.log("Sex radio button is successfully selected",true);
		
		Assert.assertTrue(selectRadioBtnByValue(practiceFormPage.experience, "4"), 
				"Experience radio button is not selected");
		Reporter.log("Experience radio button is selected",true);
		
		Assert.assertTrue(selectCheckBoxByValues(practiceFormPage.profession, "Manual Tester",
				"Automation Tester"), "Profession check box is not selected");
		Reporter.log("Profession check box is successfully selected",true);
		
		Assert.assertTrue(selectCheckBoxByValues(practiceFormPage.tool, "Selenium Webdriver"), 
				"Tools check box is not selected successfuly");
		Reporter.log("Tools check box is successfully selected",true);
		
		Select selectContinent=new Select(practiceFormPage.continents);
		selectContinent.selectByVisibleText("Europe");
		Reporter.log("continents is selected successfully",true);
		
		Select seleniumCommand=new Select(practiceFormPage.seleniumCommands);
		seleniumCommand.selectByVisibleText("Wait Commands");
		
		practiceFormPage.submit.click();
	}

}
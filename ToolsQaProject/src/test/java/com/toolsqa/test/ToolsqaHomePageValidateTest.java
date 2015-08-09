package com.toolsqa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import toolsqaPageObject.ToolsqaHomePage;
import webdriverUtil.CommonFunction;

public class ToolsqaHomePageValidateTest extends CommonFunction	{	
	
	@Parameters ({"BrowserName", "Url"})
	@BeforeClass
	public void settingUp(String browserName,String url){
		setup(browserName,url);		
	}
	
	@Test
	public void toolsqaHomePageValidateTest(){
		
		ToolsqaHomePage toolsqaHomePage;
		toolsqaHomePage=PageFactory.initElements(driver, ToolsqaHomePage.class);
		Assert.assertTrue(toolsqaHomePage.home.isDisplayed(), "HOME link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.tutorila.isDisplayed(), "TUTORIALS link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.trainings.isDisplayed(), "TRAININGS link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.forum.isDisplayed(), "FORUM link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.videos.isDisplayed(), "VIDEOS link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.about.isDisplayed(), "ABOUT link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.contacts.isDisplayed(), "CONTACT link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.demoSites.isDisplayed(), "DEMO SITES link is not display in main menu bar");
		Assert.assertTrue(toolsqaHomePage.testimonials.isDisplayed(), "TESTIMONIALS link is not display in main menu bar");
		Reporter.log("All links are available in main menu bar",true);
	}
	

}

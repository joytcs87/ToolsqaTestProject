package toolsqaPageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AutomationPracticeFormPage {
	
	@FindBy(partialLinkText="Link Test")
	public WebElement partialLinkTest;
	
	@FindBy(linkText="Link Test")
	public WebElement linkTest;
	
	@FindBy(name="firstname")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	@FindBy(name="sex")
	public List <WebElement> sex;
	
	@FindBy(name="exp")
	public List <WebElement> experience;
	
	@FindBy(name="profession")
	public List<WebElement> profession;
	
	@FindBy(id="photo")
	public WebElement photo;
	
	@FindBy(name="tool")
	public List<WebElement> tool;
	
	@FindBy(name="continents")
	public WebElement continents;
	
	@FindBy(name="selenium_commands")
	public WebElement seleniumCommands;
	
	@FindBy(id="submit")
	public WebElement submit;
			
}

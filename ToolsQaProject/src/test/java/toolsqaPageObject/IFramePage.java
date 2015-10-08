package toolsqaPageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage {
	@FindBy(tagName="iframe")
	public List <WebElement> iFrameElements;
	
	@FindBy(name="firstname")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	@FindBy(name="sex")
	public List <WebElement> sex;
	
	@FindBy(name="exp")
	public List<WebElement> exp;
	
	@FindBy(name="profession")
	public List<WebElement> profession;
	
	@FindBy(id="datepicker")
	public WebElement date;
	
	@FindBy(name="tool")
	public List<WebElement> tool;
	
	@FindBy(name="continents")
	public WebElement continents;
	
	@FindBy(id="selenium_commands")
	public WebElement seleniumCommand;
	
	@FindBy(id="submit")
	public WebElement submit;

}

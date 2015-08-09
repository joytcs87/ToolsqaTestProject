package toolsqaPageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


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
	
	//Utility function for practice from page
	
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
}

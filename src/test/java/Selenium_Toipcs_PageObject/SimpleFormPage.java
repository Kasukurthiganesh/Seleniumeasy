package Selenium_Toipcs_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {
	 WebDriver driver;
	public SimpleFormPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement inputForms;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Simple Form Demo')]")
	@CacheLookup
	WebElement Simple_Form_Demo;
	@FindBy(how=How.XPATH,using="//input[@id='user-message']")
	@CacheLookup
	WebElement Enter_Message;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Show Message')]")
	@CacheLookup
	WebElement Show_message_Button;
	@FindBy(how=How.XPATH,using="//span[@id='display']")
	@CacheLookup
	WebElement Your_Message;
	@FindBy(how=How.XPATH,using="//input[@id='sum1']")
	@CacheLookup
	WebElement Sum1;
	@FindBy(how=How.XPATH,using="//input[@id='sum2']")
	@CacheLookup
	WebElement Sum2;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Get Total')]")
	@CacheLookup
	WebElement Get_Total;
	@FindBy(how=How.XPATH,using="//span[@id='displayvalue']")
	@CacheLookup
	WebElement Display_Value;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[2]/a/img")
	@CacheLookup
	WebElement Logo;
	@FindBy(id="at-cv-lightbox-close")
	@CacheLookup
	WebElement Popups;
	
	
	
	public void inputForms()
		{
			inputForms.click();
		}
	public void SimpleFormDemo1()
		{
			Simple_Form_Demo.click();
		}
		
    public void EnterMessage1(String enteryourMessage) 
        {
	      Enter_Message.sendKeys(enteryourMessage);	
        }
    public void Show_message_Button()
        {
	      Show_message_Button.click();
        }
   public String Your_Message() 
        {
	    return  Your_Message.getText();
		
        }
   public void Sum1(String value1) 
        {
            Sum1.sendKeys(value1);
        }
   public void Sum2(String value2) 
        {
	       Sum2.sendKeys(value2);
        }
  public void Get_Total() 
        {
	       Get_Total.click();
        }
  public String Display_Value()
        {
	       return Display_Value.getText();
		 }
  public boolean Logo()
         {
	        return Logo.isDisplayed();
         }
  public void Popups()
  {
	  Popups.click();
  }
}

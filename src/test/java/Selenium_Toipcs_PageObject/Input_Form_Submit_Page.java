package Selenium_Toipcs_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Input_Form_Submit_Page {
	WebDriver driver;
	public Input_Form_Submit_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Input Form Submit')]")
	@CacheLookup
	WebElement Input_Form_Submit_Page;
	@FindBy(how=How.XPATH,using="//input[@name='first_name']")
	@CacheLookup
	WebElement First_Name;
	@FindBy(how=How.XPATH,using="//input[@name='last_name']")
	@CacheLookup
	WebElement last_name;
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	@CacheLookup
	WebElement Email_Address;
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	@CacheLookup
	WebElement Phone_Number;
	@FindBy(how=How.XPATH,using="//input[@name='address']")
	@CacheLookup
	WebElement Address_Enter;
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	@CacheLookup
	WebElement City_Name;
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement Select_State;
	@FindBy(how=How.XPATH,using="//select[@name='state']/option[16]")
	@CacheLookup
	WebElement Select_India;
	@FindBy(how=How.XPATH,using="//input[@name='zip']")
	@CacheLookup
	WebElement ZipCode;
	@FindBy(how=How.XPATH,using="//input[@name='website']")
	@CacheLookup
	WebElement Enter_Website;
	@FindBy(how=How.XPATH,using="//input[@value='no']")
	@CacheLookup
	WebElement Do_you_have_hosting;
	@FindBy(how=How.XPATH,using="//textarea[@class='form-control']")
	@CacheLookup
	WebElement Project_Description;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default']")
	@CacheLookup
	WebElement SendButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement inputForms;
	@FindBy(how=How.ID,using="at-cv-lightbox-close")
	@CacheLookup
	WebElement popups;
	@FindBy(xpath="//legend[contains(text(),'Contact Us Today!')]")
	@CacheLookup
	WebElement logo;
	public void popups()
	{
		popups.click();
	}
	public void inputForms()
	{
		inputForms.click();
	}
	public void Input_Form_Submit()
	{
		Input_Form_Submit_Page.click();
	}
	public void First_Name(String FirstName)
	{
		First_Name.sendKeys(FirstName);
	}
	public void last_name(String LastName)
	{
		last_name.sendKeys(LastName);
	}
	public void Email_Address(String Email)
	{
		Email_Address.sendKeys(Email);
	}
	public void Phone_Number(String PhoneNumber)
	{
		Phone_Number.sendKeys(PhoneNumber);
	}
	public void Address_Enter(String Address)
	{
		Address_Enter.sendKeys(Address);
	}
	public void City_Name(String City)
	{
		City_Name.sendKeys(City);
	}
	
	public void Select_State()
	{
		Select_State.click();
	}
	
	public void Select_India()
	{
		Select_India.click();
	}
	
	public void ZipCode(String ZipCode1)
	{
		ZipCode.sendKeys(ZipCode1);
	}
	
	public void Enter_Website(String Website)
	{
		Enter_Website.sendKeys(Website);
	}
	public void Do_you_have_hosting()
	{
		Do_you_have_hosting.click();
	}
	
	public void Project_Description(String Description)
	{
		Project_Description.sendKeys(Description);
	}
	
	public void SendButton()
	{
		SendButton.click();
	}
	public boolean logo()
	{
		return logo.isDisplayed();
	}
		
	
	
	


}

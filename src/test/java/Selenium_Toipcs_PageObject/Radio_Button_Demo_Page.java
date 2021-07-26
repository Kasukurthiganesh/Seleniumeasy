package Selenium_Toipcs_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Radio_Button_Demo_Page {
	WebDriver driver;
	public Radio_Button_Demo_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement inputForms;
	@FindBy(xpath="//a[contains(text(),'Radio Buttons Demo')]")
	@CacheLookup
	WebElement Radio_Buttons_Demo_is_clicked;
	@FindBy(xpath="//button[@id='buttoncheck'] ")
	@CacheLookup
	WebElement Get_Checked_Value;
	@FindBy(xpath="//p[contains(text(),'Radio button is Not checked')]")
	@CacheLookup
	WebElement check_message;
	@FindBy(xpath="//input[@value='Female']")
	@CacheLookup
	WebElement click_on_female;
	@FindBy(xpath="//button[@id='buttoncheck']")
	@CacheLookup
	WebElement Get_Checked_Value2;
	@FindBy(xpath="//p[contains(text(),\"Radio button 'Female' is checked\")]")
	@CacheLookup
	WebElement check_message2;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]")
	@CacheLookup
	WebElement click_on_Sex_male_button;
	@FindBy(xpath="//input[@value='15 - 50']")
	@CacheLookup
	WebElement click_on_age_button;
	@FindBy(xpath="//button[contains(text(),'Get values')]")
	@CacheLookup
	WebElement click_on_Get_Values;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")
	@CacheLookup
	WebElement Message_check;
	@FindBy(id="at-cv-lightbox-close")
	@CacheLookup
	WebElement popups;
	public void inputForms()
	{
		inputForms.click();
	}
	public void Radio_Buttons_Demo_is_clicked()
	{
		Radio_Buttons_Demo_is_clicked.click();
	}
	public void Get_Checked_Value()
	{
		Get_Checked_Value.click();
	}
	public String check_message()
	{
		return check_message.getText();
	}
	public void click_on_female()
	{
		click_on_female.click();
	}
	public void Get_Checked_Value2()
	{
		Get_Checked_Value2.click();
	}
	public String check_message2()
	{
		return check_message2.getText();
	}
	
	public void click_on_Sex_male_button()
	{
		click_on_Sex_male_button.click();
	}
	public void click_on_age_button()
	{
		click_on_age_button.click();
	}
	public void click_on_Get_Values()
	{
		click_on_Get_Values.click();
	}
	public String Message_check()
	{
		return Message_check.getText();
	}
	public void popups()
	{
		popups.click();
	}
	

}

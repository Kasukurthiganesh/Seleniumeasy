package Selenium_Toipcs_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
	 WebDriver driver;
	public CheckBoxPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	WebElement input_Forms;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Checkbox Demo')]")
	@CacheLookup
	WebElement CheckBox_Demo;
	@FindBy(how=How.XPATH,using="//input[@id='isAgeSelected']")
	@CacheLookup
	WebElement Checkbox_clicked;
	@FindBy(how=How.XPATH,using="//div[@id='txtAge']")
	@CacheLookup
	WebElement Text_Message_displayed;
	@FindBy(how=How.XPATH,using="//input[@id='check1']")
	@CacheLookup
	WebElement check_all_button_clicked;
	@FindBy(how=How.XPATH,using="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label")
	@CacheLookup
	WebElement option4;
	@FindBy(how=How.XPATH,using="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label")
	@CacheLookup
	WebElement option1;
	@FindBy(how=How.XPATH,using="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label")
	@CacheLookup
	WebElement option2;
	@FindBy(how=How.XPATH,using="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label")
	@CacheLookup
	WebElement option3;
	@FindBy(how=How.ID,using="at-cv-lightbox-close")
	@CacheLookup
	WebElement Popups;
	
	public void input_Forms()
	
	{
		input_Forms.click();
	}
	public void CheckBox_Demo() 
	{
		CheckBox_Demo.click();
	}
	public void Checkbox_clicked() 
	{
		Checkbox_clicked.click();
	}

	public String Text_Message_displayed() 
	{
		return Text_Message_displayed.getText();
	}

	public void check_all_button_clicked() 
	{
		check_all_button_clicked.click();
	}

	public void option1() 
	{
		option1.click();
	}

	public void option2() 
	{
		option2.click();
	}

	public void option3() 
	{
		option3.click();
	}
	public void option4() 
	{
		option4.click();
	}
	public void Popups()
	  {
		  Popups.click();
	  }


}

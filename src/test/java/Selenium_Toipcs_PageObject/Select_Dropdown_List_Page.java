package Selenium_Toipcs_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Select_Dropdown_List_Page {
	WebDriver driver;
	public  Select_Dropdown_List_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Select Dropdown List')]")
	@CacheLookup
	WebElement click_on_Select_DropDown_List;
	@FindBy(xpath="//select[@id='select-demo']")
	@CacheLookup
	WebElement click_on_please_select_button;
	@FindBy(xpath="//select[@id='select-demo']/option[3] ")
	@CacheLookup
	WebElement select_monday_button;
	@FindBy(xpath="//p[contains(text(),'Day selected :- Monday')] ")
	@CacheLookup
	WebElement check_message;
	@FindBy(xpath="//option[contains(text(),'New York')]")
	@CacheLookup
	WebElement click_on_new_York_Button;
	@FindBy(xpath="//button[@id='printMe']")
	@CacheLookup
	WebElement click_on_First_selected;
	@FindBy(xpath="//p[contains(text(),'First selected option is : New York')] ")
	@CacheLookup
	WebElement check_message2;
	@FindBy(xpath="//option[contains(text(),'Texas')]")
	@CacheLookup
	WebElement click_on_Texas_button;
	@FindBy(xpath="//button[@id='printAll']")
	@CacheLookup
	WebElement click_on_GetAll_Selected_Button;
	
	@FindBy(xpath="//p[contains(text(),'Options selected are : Texas')]")
	@CacheLookup
	WebElement options_selected_is_displayed;
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement inputForms;
	@FindBy(how=How.ID,using="at-cv-lightbox-close")
	@CacheLookup
	WebElement popups;
	public void click_on_Select_DropDown_List()
	{
		click_on_Select_DropDown_List.click();
	}
	public void click_on_please_select_button()
	{
		click_on_please_select_button.click();
	}
	public void select_monday_button()
	{
		select_monday_button.click();
	}
	public String check_message()
	{
		return check_message.getText();
	}
	public void click_on_new_York_Button()
	{
		click_on_new_York_Button.click();
	}
	public void click_on_First_selected()
	{
		click_on_First_selected.click();
	}
	public String check_message2()
	{
		return check_message2.getText();
	}
	public void click_on_Texas_button()
	{
		click_on_Texas_button.click();
	}
	public void click_on_GetAll_Selected_Button()
	{
		click_on_GetAll_Selected_Button.click();
	}
	public String options_selected_is_displayed()
	{
		return options_selected_is_displayed.getText();
	}
	public void inputForms()
	{
		inputForms.click();
	}
	public void Popups()
	{
		popups.click();
	}

}

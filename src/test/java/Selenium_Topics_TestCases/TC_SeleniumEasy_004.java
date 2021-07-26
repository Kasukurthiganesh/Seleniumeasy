package Selenium_Topics_TestCases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Selenium_Toipcs_PageObject.Select_Dropdown_List_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TC_SeleniumEasy_004 extends BaseClass{
	@Epic("SeleniumEasy")
	@Feature("Feature:InputForms")
	@Story("Select_Dropdown_List_Page")
	@Description("verification Select_Dropdown_List_Page")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=01,description="verify the Select_Dropdown_List_Page")
	public void  Select_Dropdown_List_Page() throws IOException, InterruptedException{
		Select_Dropdown_List_Page sd=new Select_Dropdown_List_Page(driver);
		Thread.sleep(3000);
		sd.Popups();                                          logger.info("popups is disabled");
		sd.inputForms();                                      logger.info("input_Forms is clicked");
		sd.click_on_Select_DropDown_List();                   logger.info("click_on_Select_DropDown_List");
		sd.click_on_please_select_button();                   logger.info("click_on_please_select_button");
		sd.select_monday_button();                            logger.info("select_monday_button");
	    String text1=sd.check_message();                      logger.info("check_message");
		sd.click_on_new_York_Button();                        logger.info("click_on_new_York_Button");
		Thread.sleep(3000);                                   
		sd.click_on_First_selected();                         logger.info("click_on_First_selected");
	    String text2=sd.check_message2();                     logger.info("check_message2");
	    Thread.sleep(3000);
		sd.click_on_Texas_button();                           logger.info("click_on_Texas_button");
		sd.click_on_GetAll_Selected_Button();                 logger.info("click_on_GetAll_Selected_Button");
	    String text3=sd.options_selected_is_displayed();      logger.info("options_selected_is_displayed");
	 if(text1.equals("Day selected :- Monday"))
	 {
		   capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Successfull Displayed the Message is "+text1);
			logger.info("The Message is Successfull Displayed"); 
	 }
	 else
	 {
		 capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Not Display the message is "+text1);
			logger.info("The Message is Not Display"); 
	 }
	 if(text2.equals("First selected option is : New York"))
	 {
		   capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Successfull Displayed the Message is "+text2);
			logger.info("The Message is Successfull Displayed"); 
	 }
	 else
	 {
		 capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Not Display the message is "+text2);
			logger.info("The Message is Not Display"); 
	 }
	 if(text3.equals("Options selected are : Texas"))
	 {
		   capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Successfull Displayed the Message is "+text3);
			logger.info("The Message is Successfull Displayed"); 
	 }
	 else
	 {
		 capturescreen(driver, "TC_SeleniumEasy_004");
			System.out.println("The Message is Not Display the message is "+text3);
			logger.info("The Message is Not Display"); 
	 }
		
		
		
	}

}

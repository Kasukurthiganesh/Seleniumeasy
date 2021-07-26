package Selenium_Topics_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium_Toipcs_PageObject.Radio_Button_Demo_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TC_SeleniumEasy_003 extends BaseClass {
	@Epic("SeleniumEasy")
	@Feature("Feature:InputForms")
	@Story("Radio_Button_Demo")
	@Description("verification of Radio_Button_Demo")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=01,description="verify the Radio_Button_Demo")
	public void Radio_Button_Demo() throws IOException {
		Radio_Button_Demo_Page rb =new Radio_Button_Demo_Page(driver);
		rb.popups();                                logger.info("popups is diabled");
		rb.inputForms();                            logger.info("input_Forms is clicked");
		rb.Radio_Buttons_Demo_is_clicked();
		rb.Get_Checked_Value();                     logger.info("Get_Checked_Value");
String text=rb.check_message();                     logger.info("check_message");
		rb.click_on_female();                       logger.info("click_on_female);");
		rb.Get_Checked_Value();                     logger.info("Get_Checked_Value");
String text2=rb.check_message2();                   logger.info("check_message2;");
       rb.click_on_Get_Values();                    logger.info("click_on_Get_Values; ");
 String text3 =rb.Message_check();                  logger.info("Message_check;");
       rb.click_on_Sex_male_button();               logger.info("click_on_Sex_male_button;");
       rb.click_on_age_button();                    logger.info("click_on_age_button;");
       rb.click_on_Get_Values();                    logger.info("click_on_Get_Values;");
 String text4 = rb.Message_check();                 logger.info("Message_check;");
 if(text.equals("Radio button is Not checked"))
 {
	   capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Successfull Displayed the Message is "+text);
		logger.info("The Message is Successfull Displayed"); 
 }
 else
 {
	 capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Not Display the message is "+text);
		logger.info("The Message is Not Display"); 
 }
 if(text2.equals("Radio button 'Female' is checked"))
 {
	   capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Successfull Displayed the Message is "+text2);
		logger.info("The Message is Successfull Displayed"); 
 }
 else
 {
	 capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Not Display the message is "+text2);
		logger.info("The Message is Not Display"); 
 }
 if(text3.equals("Sex :\r\n"
 		+ "Age group:"))
 {
	   capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Successfull Displayed the Message is "+text3);
		logger.info("The Message is Successfull Displayed"); 
 }
 else
 {
	 capturescreen(driver, "TC_SeleniumEasy_003");
		System.out.println("The Message is Not Display the message is "+text3);
		logger.info("The Message is Not Display"); 
		//Assert.assertTrue(false);
 }
 if(text4.equals("Sex : Female\r\n"
 		+ "Age group: 15 - 50"))
	 {
		   capturescreen(driver, "TC_SeleniumEasy_003");
			System.out.println("The Message is Successfull Displayed the Message is "+text4);
			logger.info("The Message is Successfull Displayed"); 
	 }
	 else
	 {
		 capturescreen(driver, "TC_SeleniumEasy_003");
			System.out.println("The Message is Not Display the message is "+text4);
			logger.info("The Message is Not Display"); 
	 }
       
       
	
		
		
	}

}

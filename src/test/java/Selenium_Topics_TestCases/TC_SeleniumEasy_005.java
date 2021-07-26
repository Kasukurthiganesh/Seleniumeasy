package Selenium_Topics_TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium_Toipcs_PageObject.Input_Form_Submit_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TC_SeleniumEasy_005 extends BaseClass{
	public String firstname="Rajesh";
	public String lastname="Kumar";
	public String email="lovesganu@gmail.com";
	public String phonenumber="123456789";
	public String address="Srt 1234,Sanath nagar,Hyderbad";
	public String city="Hyderbad";
	public String zipcode="530001";
	public String website="www.rajeshKumar.com";
	public String description="There is will there is way";
	
	@Epic("SeleniumEasy")
	@Feature("Feature:InputForms")
	@Story("Select Dropdown List")
	@Description("verification Input_Form_Submit")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority=01,description="verify Input_Form_Submit")
	public void Input_Form_Submit() throws InterruptedException, IOException  {
		
		Input_Form_Submit_Page ip =new Input_Form_Submit_Page(driver);
		
		ip.popups();                           logger.info("popups");
		ip.inputForms();                       logger.info("inputForms");
		ip.Input_Form_Submit();                logger.info("Input_Form_Submit");
		ip.First_Name(firstname);              logger.info("firstname is enter");
		ip.last_name(lastname);                logger.info("lastname is enter");
		ip.Email_Address(email);               logger.info("email is enter");
		ip.Phone_Number(phonenumber);          logger.info("phonenumber is enter");
		ip.Address_Enter(address);             logger.info("address is enter");
		ip.City_Name(city);                    logger.info("city is enter");
		ip.Select_State();                     logger.info("state is clicked");
		ip.ZipCode(zipcode);                   logger.info("zipcode is enter");
		ip.Enter_Website(website);             logger.info("website is enter");
		ip.Do_you_have_hosting();              logger.info("no is clicked");
		ip.Project_Description(description);   logger.info("description is clicked");
		Thread.sleep(5000);
		capturescreen(driver ,"TC_SeleniumEasy_005");
		ip.SendButton();                       logger.info("send button is clicked");
		boolean Logo=ip.logo(); 
		Assert.assertEquals(Logo,true);        logger.info("logo is displayed");
		
		
		
	}

}

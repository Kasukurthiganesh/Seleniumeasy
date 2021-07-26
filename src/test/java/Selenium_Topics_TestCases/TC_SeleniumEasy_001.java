package Selenium_Topics_TestCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium_Toipcs_PageObject.SimpleFormPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TC_SeleniumEasy_001 extends BaseClass {
	public String EnterMessage="Hai  Selenium !!!";
	public String Value1="25";
	public String Value2="55";
	@Epic("SeleniumEasy")
	@Feature("Feature:InputForms")
	@Story("Simple Form Demo")
	@Description("Verify Simple Form Demo In all possbile ways")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=01,description="Verify SimpleFormDemo")
	public void VerifySimpleFormDemo() throws InterruptedException, IOException {
		SimpleFormPage sp=new SimpleFormPage(driver);
        sp.Popups();                         logger.info("popups is diabled");
		sp.inputForms();                     logger.info("inputForms is clicked");
		sp.SimpleFormDemo1();                logger.info("simple form is clicked");
		sp.EnterMessage1(EnterMessage);      logger.info("message is enter in enter box");
		sp.Show_message_Button();            logger.info("clicked on show message");
String text	=sp.Your_Message();              logger.info("your message is verifed");
		sp.Sum1(Value1);                     logger.info("number is added");
		sp.Sum2(Value2);                     logger.info("number2 is added");
		sp.Get_Total();                      logger.info("get total button clicked");
String sum=sp.Display_Value();               logger.info("sum is showed");
boolean img=sp.Logo();                       logger.info("logo is displayed");
        Assert.assertEquals(img, true);
	if(text.equals("Hai Selenium !!!"))
	{  
		capturescreen(driver, "TC_SeleniumEasy_001");
		logger.info("Message is Matched");
		System.out.println("Your Message:"+ text);
	}
	else
	{ 
		logger.info("Message is Not Matched");
		capturescreen(driver,"TC_SeleniumEasy_001");
		System.out.println("Text is failed because the Message is "+text);
	}
	if(sum.equals("80"))
	{    
		capturescreen(driver, "TC_SeleniumEasy_001");
		logger.info("sum is valid");
		System.out.println("Total 25+55 ="+ sum);
	}
	else
	{    
		logger.info("sum is Not valid");
		capturescreen(driver,"TC_SeleniumEasy_001");
		System.out.println("number is failed because the sum is "+ sum);
	}	
	
	}
}

package Selenium_Topics_TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Selenium_Toipcs_PageObject.CheckBoxPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TC_SeleniumEasy_002 extends BaseClass{
	@Epic("SeleniumEasy")
	@Feature("Feature:InputForms")
	@Story("Checkbox_Demo")
	@Description("verify Checkbox is clicked")
	@Severity(SeverityLevel.NORMAL)
	@Test(priority=01,description="verify Checkbox_Demo")
	public void  Checkbox_Demo() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CheckBoxPage cb =new CheckBoxPage(driver);
		cb.Popups();                                 logger.info("popups is diabled");
		cb.input_Forms();                            logger.info("input_Forms is clicked");
		cb.CheckBox_Demo();                          logger.info("CheckBox_Demo");
		cb.Checkbox_clicked();                       logger.info("Checkbox_clicked");
		String Text=cb.Text_Message_displayed();     logger.info("Text_Message_displayed");
		cb.check_all_button_clicked();               logger.info("check_all_button_clicked");
		cb.option4();                                logger.info("option4 clicked");
		Thread.sleep(3000);                          
		cb.option3();                                logger.info("option3 clicked");
		cb.option2();                                logger.info("option2 clicked");
		Thread.sleep(3000);
		cb.option1();                                logger.info("option1 clicked");
		if(Text.equals("Success - Check box is checked"))
		{ 
			capturescreen(driver, "TC_SeleniumEasy_002");
			System.out.println("The Message is Successfull Displayed");
			logger.info("The Message is Successfull Displayed");
		}
		else
		{ 
			capturescreen(driver, "TC_SeleniumEasy_002");
			System.out.println("The Message is Not Display");
			logger.info("The Message is Not Display");
		}
		
		
	}


}

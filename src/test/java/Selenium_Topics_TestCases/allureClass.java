package Selenium_Topics_TestCases;

import org.openqa.selenium.WebDriver;

public class allureClass extends BaseClass {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver =new ThreadLocal<WebDriver>();
	public WebDriver initialization_driver()
	{
		tdriver.set(driver);
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

}

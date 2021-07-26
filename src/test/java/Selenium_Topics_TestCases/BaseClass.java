package Selenium_Topics_TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Selenium_Toipcs_Utilits.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;
	Readconfig rc =new Readconfig();
	public String Url= rc.setupbaseurl();
	@Parameters("browser")
	@BeforeClass
	public void Setup(String br)
	{
		logger=Logger.getLogger("Selenium easy");
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (br.equals("microsoft Edge")) {
			WebDriverManager.iedriver().setup();
			driver=new EdgeDriver();	
		}
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
			
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
	public  void capturescreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshot/"+tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	
	}
	

}

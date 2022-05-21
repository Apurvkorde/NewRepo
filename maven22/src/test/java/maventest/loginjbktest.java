package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mavenclass.loginjbk;
import okio.Options;

public class loginjbktest {
	WebDriver driver;
	//ChromeOptions options;
	//ChromeOptions options=new ChromeOptions();
    loginjbk lj;
    
    @BeforeMethod
    public void openBrowser() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\maven22\\chromedriver.exe");
    	//ChromeOptions options=new ChromeOptions();
    	//options.addArguments("--headless");
		//options.addArguments("--disable-gpu");
        //options.addArguments("--disable-dev-shm-usage");
    	driver=new ChromeDriver();
    	driver.get("file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
    	driver.manage().window().maximize();
    	lj=new loginjbk(driver);
    }	
    //file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html
    @Test
    public void VerifyTitle() {
    	lj.correctCredentials();//dashboard
    	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard"); 
    }
}

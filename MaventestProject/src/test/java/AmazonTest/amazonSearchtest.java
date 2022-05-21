package AmazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amazonclass.Amazontitlesearch;

 

public class amazonSearchtest {
WebDriver driver;
Amazontitlesearch St;

@BeforeMethod
public void opentitle() {
	System.setProperty("webDriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=1787203745431401943&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300354&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjwpcOTBhCZARIsAEAYLuWWVoLKsi98uIZQuit9MLWgWTK80crBiAWr6npKiesRP5Gu64w3q0gaAv7pEALw_wcB");
    driver.manage().window().maximize();
    St=new Amazontitlesearch(driver);
}
@Test
public void verifytitle() {
	St.checktile();
	Assert.assertEquals(driver.getTitle(),"this");
}
}

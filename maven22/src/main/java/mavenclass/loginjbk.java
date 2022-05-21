package mavenclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginjbk {
	 WebDriver driver;
	 ChromeOptions Options;
	    @FindBy(id="email")
	    public WebElement Email;
	    @FindBy(id="password")
	    public WebElement Password;
	    @FindBy(xpath="//button")
	    public WebElement button;
	    
	    public loginjbk(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    }
		public void correctCredentials() {
			Email.sendKeys("kiran@gmail.com");
			Password.sendKeys("123456");
			button.click();
		}
		
}

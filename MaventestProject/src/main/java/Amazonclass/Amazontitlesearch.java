package Amazonclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazontitlesearch {
WebDriver driver;
@FindBy(id ="//a[contains(text(),'Mobiles')]")
public WebElement Mobiles;
@FindBy(xpath ="//*[@id=\"nav-xshop\"]/a[1]")
public WebElement Best;



public Amazontitlesearch(WebDriver driver) {
   this.driver=driver;
   PageFactory.initElements(driver,this);
}

public void checktile() {
	Mobiles.click();
	Best.click();
}
}

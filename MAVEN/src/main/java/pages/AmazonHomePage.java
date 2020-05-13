package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class AmazonHomePage extends BaseTest
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	public AmazonHomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchproduct(String productname)
	{
		searchbox.sendKeys(productname,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}	
	
}


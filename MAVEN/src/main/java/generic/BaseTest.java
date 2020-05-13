package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.AmazonHomePage;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
	public AmazonHomePage amazon;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

	@BeforeTest
	public void openBrowser() {
		String browser = FileLib.getProp("name");
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		gotoAmazon();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	public void gotoAmazon() {
		driver.get(FileLib.getProp("amazon_url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		amazon = new AmazonHomePage(driver);
	}
}

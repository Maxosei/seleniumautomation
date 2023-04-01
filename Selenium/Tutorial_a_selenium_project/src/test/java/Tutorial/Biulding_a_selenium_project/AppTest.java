package Tutorial.Biulding_a_selenium_project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test

	public void buildingTestMethod() {

	System.setProperty("webdriver.chrome.driver", "//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.navigate().to("https://www.browserstack.com/");

	String verifyBrowserStackTitle = driver.getTitle();

	AssertEquals("Most Reliable App & Cross Browser Testing Platform | BrowserStack",verifyBrowserStackTitle);
}
}

package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirtstTestNg {
	WebDriver driver;

	/*
	 * @BeforeSuite public void bsuite() {
	 * System.out.println("TestNG Before Suite"); }
	 * 
	 * @AfterSuite public void asuite() { System.out.println("TestNG After Suite");
	 * }
	 * 
	 * @BeforeClass public void bClass() {
	 * System.out.println("TestNG Before Class"); }
	 * 
	 * @AfterClass public void aClass() { System.out.println("TestNG After Class");
	 * }
	 */
	@BeforeTest
	public void bTest() {
		// System.out.println("TestNG Before test");
		System.setProperty("webdriver.chrome.driver",
				"//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void aTest() {
		// System.out.println("TestNG Before test");
		

	}

	/*
	 * @Test(enabled = false) public void test() {
	 * System.out.println("Test Method"); driver.get("https://www.google.com");
	 * System.out.println(driver.getTitle()); }
	 * Use enabled = boolean to disable or enable a test
	 * Use priority = int to set the heircahy of tests
	 */

	@Test(priority = 0, invocationCount = 4, skipFailedInvocations = true)
	//invocationCount calls this test 4 times
	public void test() {
		System.out.println("Steps before Assertion");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String expectTitle = "Google";
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, expectTitle);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectTitle);
		System.out.println("Steps after Assertion");
		sa.assertAll();
	}

	@Test(priority = 1, enabled = true)
	public void test1() {
		System.out.println("Test Method 1");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(true, false);
	}

	@Test(priority = 2, dependsOnMethods = {"test1"}, alwaysRun = true)
	//dependsonMethod sets the method to be checked and alwaysRun sets it to run
	public void apple() {
		driver.findElement(By.id("email")).sendKeys("Prince Arthur");

	}
	@Test(priority = 3)
	public void test2() {
		driver.get("https://apple.com");
	}
}

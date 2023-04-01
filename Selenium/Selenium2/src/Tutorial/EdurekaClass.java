package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EdurekaClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdrive.chrome.driver", "//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		//WebElement createAccountBtn = driver.findElement(By.xpath("//div[@class='_6ltg']/child::div[contains =(@class:'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')"));
		//System.out.println(createAccountBtn);
		//createAccountBtn.click();
		WebElement str = driver.findElement(By.linkText("Create new account"));
		str.click();
		
		System.out.println(str);
		//*[@id="u_0_0_bq"]
		Thread.sleep(1000);
		//driver.close();
		//how use Select 
		WebElement month = driver.findElement(By.id("month"));
		Select month_1 = new Select(month);
		Thread.sleep(1000);
		month_1.selectByVisibleText("Jan");
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		Thread.sleep(1000);
		day1.selectByIndex(6);
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		Thread.sleep(1000);
		year1.selectByValue("1992");
		
		
	}

}

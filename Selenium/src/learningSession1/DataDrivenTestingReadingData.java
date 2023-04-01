package learningSession1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataDrivenTestingReadingData {
	WebDriver driver;
	
	@Test(dataProvider = "TestDataFeed")
	public void facebookLogin(String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "/Users/princearthur/Downloads/chromedriver_mac64 (3) 2/chromeDriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		System.out.println(uname + ' '+ pwd);
	}

	@DataProvider
	public Object[][] TestDataFeed(){
		ExcelDataSheet config = new ExcelDataSheet("/Users/princearthur/Desktop/fill.xlsx");
		int rows = config.getRowCount(0);
		Object [][] userandpwd = new Object [rows][2];
		
		for(int i = 0; i < rows; i++) 
		{
			userandpwd[i][0] = config.getData(0, i, 0);
			userandpwd[i][i] = config.getData(0, i, 1);
		}
		return userandpwd;
	}
	
}

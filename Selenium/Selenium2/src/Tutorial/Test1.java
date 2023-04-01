package Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	System.setProperty("webdriver.chrome.driver", "//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver");
        WebDriver driver = new ChromeDriver();

        Actions act = new Actions(driver);
        driver.get("https://demo.guru99.com/test/newtours/");

        WebElement Unm = driver.findElement(By.name("userName"));
        WebElement pass = driver.findElement(By.name("password"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(Unm)) ;
        Unm.sendKeys("mecury");
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.visibilityOf(pass));
        pass.sendKeys("default");
        
       
	}

}

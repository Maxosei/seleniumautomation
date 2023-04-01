package Tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeJid {
	
	public static void main(String[] args ) {
		System.setProperty("webdriver.chrome.driver",  "//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(search)) ;
	     search.sendKeys("Jid");
	   //*[@id="search"]
	     btnSearch.click();
	    
		List<WebElement> jidSearch = driver.findElements(By.id("contents"));
		
		System.out.println(jidSearch);
		 for (WebElement e : jidSearch) {
			 System.out.println(e.getText());
		 }
		
		
	}
	
}

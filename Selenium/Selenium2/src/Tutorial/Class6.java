package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//princearthur//Downloads//chromedriver_mac64 (4)//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");

	}

	
}

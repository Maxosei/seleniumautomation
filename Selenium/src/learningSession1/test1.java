package learningSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
"/Users/princearthur/Downloads/chromedriver_mac64 (3) 2/chromeDriver");
	     WebDriver driver = new ChromeDriver(); 

			/*
			 * driver.get("http://www.google.com/");
			 * 
			 * // Let the user actually see something!
			 * 
			 * WebElement searchBox = driver.findElement(By.name("q"));
			 * 
			 * searchBox.sendKeys("ChromeDriver");
			 * 
			 * searchBox.submit();
			 * 
			 * // Let the user actually see something!
			 * 
			 */
	     driver.get("http://www.facebook.com");
	     WebElement facebookImage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
	     
	     System.out.println(facebookImage.getAttribute("class"));
	     System.out.println(facebookImage.getAttribute("src"));
	     System.out.println(facebookImage.getAttribute("alt"));
	     
	     	
				}

}

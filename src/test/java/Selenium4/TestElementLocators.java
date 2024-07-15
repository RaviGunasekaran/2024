package Selenium4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestElementLocators {

	public static void main(String[] args) throws IOException, InterruptedException {
		// All Driver Declarations
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		
//		Get Text
		String loginElement = "//*[@id=\"menu-item-27625\"]/a/span[2]";
		String text = driver.findElement(By.xpath(loginElement)).getText();
		System.out.println(text);

		//Click on Login
		driver.findElement(By.xpath(loginElement)).click();
		
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(1000);
		driver.quit();
		System.out.println("====	COMPLETED	====");
	}
	
}

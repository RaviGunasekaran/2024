package Selenium4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTabNavigations {

	public static void main(String[] args) throws IOException, InterruptedException {
		// All Driver Declarations
		WebDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://reqres.in/");
		System.out.println(" TAB Url : " +driver.getCurrentUrl());
		String tabHandle = driver.getWindowHandle();
		System.out.println("tabHandle === "+tabHandle);
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/documentation/test_practices/overview/");
		System.out.println(" NEW WINDOW Url : " +driver.getCurrentUrl());
		Thread.sleep(1000);
		Set<String> listOfWindows = driver.getWindowHandles();
		Iterator<String> itr = listOfWindows.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println("next = "+next);
			if(next.equals(tabHandle)) {
				System.out.println(" Got Parent window and switching...");
				driver.switchTo().window(tabHandle);
				System.out.println("Switching to Parent window....");
				driver.get("https://www.google.com/");
				driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
				System.out.println(" parent Window Url : " +driver.getCurrentUrl());
				Thread.sleep(1000);
			}
		}
		driver.quit();
		System.out.println("==== TestTabNavigations	COMPLETED	====");
	}
}

package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestIFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.cssSelector("#mobile_menu_toggler")).click();
		System.out.println("Switched to Frame and clicked one element");
		Thread.sleep(800);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("Open New Window")).click();
		System.out.println("Switched to Parent Page and clicked one element");
		Thread.sleep(1000);
		driver.quit();
		System.out.println("==== TestIFrames	COMPLETED	====");
	}

}

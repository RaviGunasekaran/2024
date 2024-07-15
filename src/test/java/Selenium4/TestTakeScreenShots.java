package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestTakeScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// All Driver Declarations
		WebDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		
//		Time Stamp Generation
		Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		
//		Take whole pager screenshot
		File fullPage = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullPage, new File("./screenshot/"+FileName+"FullPageScreenshot.jpg"));

		Thread.sleep(1000);
		
//		Take whole pager screenshot
		File finalPage = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(finalPage, new File("./screenshot/"+FileName+"FinalPageScreenshot.jpg"));
		driver.quit();
		System.out.println("==== TestTakeScreenShots COMPLETED	====");
	}
}

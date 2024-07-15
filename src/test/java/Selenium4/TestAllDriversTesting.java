package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestAllDriversTesting {

//	@Test
	public void sample() throws InterruptedException {
		// Chrome Driver Declarations
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver cDriver = new ChromeDriver(options);
		cDriver.get("https://www.selenium.dev/downloads/");
		cDriver.manage().window().maximize();
		Thread.sleep(1000);
//		cDriver.close();
		cDriver.quit();
		System.out.println("====	CHROME DRIVER COMPLETED	====");
		
//		// FireFox Driver Declarations
		WebDriver fDriver = new FirefoxDriver();
		fDriver.get("http://way2automation.com");
		fDriver.manage().window().maximize();
		Thread.sleep(1000);
//		fDriver.close();
		fDriver.quit();
		System.out.println("====	FF DRIVER COMPLETED	====");
//		
//		// Edge Driver Declarations
		WebDriver eDriver = new EdgeDriver();
		eDriver.get("https://www.selenium.dev/documentation/");
		eDriver.manage().window().maximize();
		Thread.sleep(1000);
//		eDriver.close();
		eDriver.quit();
		System.out.println("====	EDGE DRIVER COMPLETED	====");
	}
	
	
	public static void main(String[] args) throws InterruptedException {

	}

}

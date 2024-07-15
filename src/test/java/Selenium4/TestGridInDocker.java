package Selenium4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGridInDocker {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
//		chromeRun();
//		firefoxRun();
//		edgeRun();
	}
	
	@Test
	private static void chromeRun() throws MalformedURLException, InterruptedException {
		ChromeOptions cOptions = new ChromeOptions();
		WebDriver cDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cOptions);
		cDriver.get("https://www.selenium.dev/documentation/");
		cDriver.findElement(By.xpath("//*[@id=\"m-documentationgrid\"]/span")).click();
		Thread.sleep(2000);
		cDriver.close();
		System.out.println("=====   GRID CHROME STANDALONE COMPLETED =====");
	}
	
	@Test
	private static void firefoxRun() throws MalformedURLException, InterruptedException {
		FirefoxOptions fOptions =  new FirefoxOptions();
		WebDriver fDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),fOptions);
		fDriver.get("https://www.selenium.dev/documentation/");
		fDriver.findElement(By.xpath("//*[@id=\"m-documentationgrid\"]/span")).click();
		Thread.sleep(2000);
		fDriver.close();
		System.out.println("=====   GRID FIREFOX STANDALONE COMPLETED =====");
	}

	private static void edgeRun() throws MalformedURLException, InterruptedException {
		EdgeOptions eOptions =  new EdgeOptions();
		WebDriver eDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),eOptions);
		eDriver.get("https://www.selenium.dev/documentation/");
		eDriver.findElement(By.xpath("//*[@id=\"m-documentationgrid\"]/span")).click();
		Thread.sleep(2000);
		eDriver.close();
		System.out.println("=====   GRID EDGE STANDALONE COMPLETED =====");
	}
	
}

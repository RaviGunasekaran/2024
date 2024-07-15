package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.console.Console;

public class TestChromeDevToolsProtocols {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		System.out.println("===   PRINT CONSOLE LOGS   ===");
		devTools.send(org.openqa.selenium.devtools.v126.log.Log.enable());
		devTools.send(Console.enable());
		devTools.addListener(org.openqa.selenium.devtools.v126.log.Log.entryAdded(), entry -> {
			System.out.println("Text is : " + (entry).getText());
			System.out.println("TimeStamp is : " + entry.getTimestamp());
			System.out.println("Source is : " + entry.getSource());
			System.out.println("Level is : " + entry.getLevel());
		});

		devTools.addListener(Console.messageAdded(), message -> {
			System.out.println("Console Text is : " + message.getText());

		});
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.quit();
		
		System.out.println("==== TestChromeDevToolsProtocols COMPLETED	====");
	}
}
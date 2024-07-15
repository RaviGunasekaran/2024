package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestMinMaxFullWindows {

	public static void main(String[] args) throws InterruptedException {
//		// Edge Driver Declarations
		WebDriver eDriver = new EdgeDriver();
		eDriver.get("https://www.selenium.dev/documentation/");
		eDriver.manage().window().fullscreen();
		Thread.sleep(1000);
		eDriver.manage().window().minimize();
		Thread.sleep(1000);
		eDriver.manage().window().maximize();
		Thread.sleep(1000);
//		eDriver.close();
		eDriver.quit();
		System.out.println("====	TestMinMaxFullWindows COMPLETED	====");

	}

}

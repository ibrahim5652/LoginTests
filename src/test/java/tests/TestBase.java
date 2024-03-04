package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver ;
	@BeforeSuite
	public void startdriver() {
		
		
		 driver = new ChromeDriver();
		driver.get("https://www.testyou.in/Login.aspx");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closebrowser() {
		driver.close();
		
	}
}

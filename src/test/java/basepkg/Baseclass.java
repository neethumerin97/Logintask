package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	protected WebDriver driver;
	@BeforeTest
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/login");
	}

}

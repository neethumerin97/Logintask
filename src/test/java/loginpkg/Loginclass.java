package loginpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Baseclass;

public class Loginclass extends Baseclass {
	WebDriver driver;
	@FindBy(name="email")
	WebElement mail;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[3]/button[2]")
	WebElement login;
	
	
	public  Loginclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	public void setvalues(String email ,String pswd) {
		mail.sendKeys(email);
		password.sendKeys(pswd);
	}
		
	
	public void loginbutton() {
		login.click();
	}

}



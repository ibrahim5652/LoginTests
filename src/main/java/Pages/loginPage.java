package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase{

	public loginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id =  "ctl00_CPHContainer_txtUserLogin")
	WebElement email;
	@FindBy(id = "ctl00_CPHContainer_txtPassword")
	WebElement password;
	@FindBy(name = "ctl00$CPHContainer$btnLoginn")
	WebElement login;
	@FindBy (id = "ctl00_CPHContainer_lblOutput")
	public WebElement error;
	
	@FindBy (id ="ctl00_CPHContainer_hprlnkForgetPassword")
	WebElement forgot;
	
	
	
	public void enteremail (String text) {
		email.clear();
		email.sendKeys(text);
	}
	public void enterpassword (String text) {
		password.clear();
		password.sendKeys(text);
	}
	public void submit() {
		login.click();
	}
	public void forogtpassword() {
		forgot.click();
}
}
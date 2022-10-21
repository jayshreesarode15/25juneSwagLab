package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement userId;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement logIn;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//input[@label='PIN']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Problem with PIN?']")private WebElement problemWithPin;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgate2FA;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement noAccountSignUp;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogIn() {
		logIn.click();
	}
	
	public void clickOnForgot() {
		forgot.click();
	}
	
	public void enterPin(String pinNumber,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	public void clickOnProblemwithPin() {
		problemWithPin.click();
	}
	
	public void clickOnForgate2FA() {
		forgate2FA.click();
	}
	
	public void clickOnSignUpNow() {
		noAccountSignUp.click();
	}
	
	
	

}

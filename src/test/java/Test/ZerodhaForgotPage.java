package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//input[@id='radio-30']")private WebElement rememberUserId;
	@FindBy(xpath="//input[@id='radio-31']")private WebElement forgotUserId;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userId;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//input[@id='radio-35']")private WebElement receiveEmail;
	@FindBy(xpath="//input[@id='radio-36']")private WebElement receiveSms;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement reset;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backToLogin;
	@FindBy(xpath="//img[@alt='Kite Android']")private WebElement playLogo;
	@FindBy(xpath="//img[@alt='Kite iOS']")private WebElement appleLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement noAccountSignup;
	@FindBy(xpath="//input[@placeholder='Captcha']")private WebElement captcha;

	
	public ZerodhaForgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnForgot() {
		forgot.click();
	}
	
	public void clickOnRememberUserid() {
		rememberUserId.click();
	}
	
	public void clickOnFrogotUserid() {
		forgotUserId.click();
	}
	
	public void enterUserID(String user) {
		userId.sendKeys(user);
	}
	
	public void enterPan(String number) {
		pan.sendKeys(number);
	}
	
	public void clickOnEmailRadioButton() {
		receiveEmail.click();
	}
	
	public void clickOnSmsRadioButton() {
		receiveSms.click();
	}
	
	public void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}
	
    public void clickOnReset() {
    	reset.click();
    }
    
    public void clickOnLogIn() {
    	backToLogin.click();
    }
    
    public void clickOnPlayLogo() {
    	playLogo.click();
    }
    
    public void clickOnAppleLogo() {
    	appleLogo.click();
    }
    
    public void clickOnZerodhaLogo() {
    	zerodhaLogo.click();
    }
    
    public void clickOnDontHaveAnAccount() {
    	noAccountSignup.click();
    }
    
    public void enterCaptcha(String value) {
    	captcha.sendKeys(value);
    }
}

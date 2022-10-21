package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {
	
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement noAccountSignUp;
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobileNumber;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[@href='/open-account/nri']")private WebElement openNRI;
	@FindBy(xpath="(//a[@href='https://signup.zerodha.com'])[1]")private WebElement signUp;
	@FindBy(xpath="(//a[@href='https://zerodha.com/about/'])[2]")private WebElement about;
	@FindBy(xpath="(//a[@href='https://zerodha.com/products/'])[3]")private WebElement products;
	@FindBy(xpath="(//a[text()='Pricing'])[1]")private WebElement pricing;
	@FindBy(xpath="(//a[text()='Support'])[1]")private WebElement support;
	@FindBy(xpath="//li[@id='navbar_menu']")private WebElement menuBar;
	
	public ZerodhaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSignUpNow() {
		noAccountSignUp.click();
	}
	
	public void enterMobileNumber(String number,WebDriver driver) {
		String handle = driver.getWindowHandle();
		System.out.println("main"+handle);
		mobileNumber.sendKeys(number);
	}
	
	public void clickOnSubmit() {
		submit.click();
	}
	
	public void clickOnOpenNRIAccount() {
		openNRI.click();
	}
	
	public void clickOnSignUp() {
		signUp.click();
	}
	
	public void clickOnAbout() {
		about.click();
	}
	
	public void clickOnProducts() {
		products.click();
	}
	
	public void clickOnPricing() {
		pricing.click();
	}
	
	public void clickOnSupport() {
		support.click();
	}
	
	public void clickOnMenuBar() {
		menuBar.click();
	}
	

}

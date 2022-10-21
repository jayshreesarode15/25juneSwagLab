package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZerodhaDashboardPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement userId;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement logIn;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//input[@label='PIN']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="(//span[text()='TATACOFFEE'])[1]")private WebElement tataCoffee;
	@FindBy(xpath="")

}

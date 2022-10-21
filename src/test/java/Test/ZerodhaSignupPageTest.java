package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import utility.Parametrization;

public class ZerodhaSignupPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openChromeBrowser();
	}
	
	@Test
	public void validateZerodhaSignupPage() throws EncryptedDocumentException, IOException {
		ZerodhaSignupPage zerodhaSignupPage = new ZerodhaSignupPage(driver);
		zerodhaSignupPage.clickOnSignUpNow();
		zerodhaSignupPage.enterMobileNumber(Parametrization.getExelData(5, 1, "Credentials"), driver);
		zerodhaSignupPage.clickOnSubmit();
	}

}
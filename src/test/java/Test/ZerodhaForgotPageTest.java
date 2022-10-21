package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import utility.Parametrization;


public class ZerodhaForgotPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openChromeBrowser();
	}
	
	@Test
	public void validateZerodhaForgotpage() throws EncryptedDocumentException, IOException {
		ZerodhaForgotPage zerodhaForgotPage = new ZerodhaForgotPage(driver);
		zerodhaForgotPage.clickOnForgot();
		zerodhaForgotPage.enterUserID(Parametrization.getExelData(0,1,"Credentials"));
		zerodhaForgotPage.enterPan(Parametrization.getExelData(3, 1, "Credentials"));
		zerodhaForgotPage.enterEmail(Parametrization.getExelData(4, 1, "Credentials"));
		zerodhaForgotPage.clickOnReset();
	}

	
		
	

}

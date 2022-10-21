package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import utility.ExtentReport;
import utility.Parametrization;
import utility.ZerodhaPageElements;

@Listeners(utility.Listeners.class)
public class ZerodhaLoginPageTest extends ZerodhaPageElements {

	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createreports() {
		reports = ExtentReport.getReports();
	}
	
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openChromeBrowser();
	}
	
	@Test
	public void validateZerodhaLogin() throws InterruptedException, EncryptedDocumentException, IOException {
		test = reports.createTest("validateZerodhaLogin");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserId(Parametrization.getExelData(0,1,"Credentials"));
		zerodhaLoginPage.enterPassword(Parametrization.getExelData(1, 1, "Credentials"));
		Thread.sleep(5000);
		zerodhaLoginPage.clickOnLogIn();
		zerodhaLoginPage.enterPin(Parametrization.getExelData(2,1,"Credentials"), driver);
		zerodhaLoginPage.clickOnContinue();
	}

	@Test
	public void signup() {
		test = reports.createTest("signup");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUpNow();
	}
	
	@Test(dependsOnMethods = {"validateZerodhaLogin"})
	public void forgot() {
		test = reports.createTest("forgot");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
	}
	
	@AfterMethod
	public void captureResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS,result.getName());
			}
		else if(result.getStatus()==ITestResult.FAILURE)
			{
				test.log(Status.FAIL, result.getName());
			}
		else 
			{
				test.log(Status.SKIP, result.getName());
			}
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
}

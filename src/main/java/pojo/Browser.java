package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver openChromeBrowser() {
		
		//System.setProperty ("webdriver.chrome.driver","C:\\Users\\SHREE\\OneDrive\\Documents\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notification");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		return driver;
	}

}

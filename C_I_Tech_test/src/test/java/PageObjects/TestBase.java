package PageObjects;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;


	public WebDriver getDriver(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace2\\C_I_Tech_test\\src\\test\\resources\\Features\\Drivers\\chromedriver.exe");
		//	driver = new ChromeDriver();

		}
		return driver;
	}
}

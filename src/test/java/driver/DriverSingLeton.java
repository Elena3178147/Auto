package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.WebDriverListener;

public class DriverSingLeton {
	private static EventFiringWebDriver driver;
	
	private DriverSingLeton () {
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", 
					"c:\\Users\\home\\workspace\\auto\\src\\main\\resources\\chromedriver.exe");
			driver = new EventFiringWebDriver(new ChromeDriver());
			driver.register(new WebDriverListener());
		}
		return driver;
	}
	
	public static void closeDriver() {
		if (driver !=null) {
			driver.quit();
			driver = null;
		}
	}
}


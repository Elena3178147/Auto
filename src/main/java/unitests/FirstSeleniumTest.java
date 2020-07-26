package unitests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

	public static void main(String[] args) {
 //   System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    
		System.setProperty("webdriver.chrome.driver", 
				"c:\\Users\\home\\workspace\\auto\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://music.yandex.by");
	    
		driver.findElement(By.className("button__label")).click();
	    
    driver.quit();

	}

}

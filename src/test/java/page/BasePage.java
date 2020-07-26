package page;

import driver.DriverSingLeton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver = DriverSingLeton.getDriver();
	
    public WebElement lookForElement(By by) {
		return driver.findElement(by);
	}

    public void open(String pageURL) {
	driver.get(pageURL);	
    }
} 

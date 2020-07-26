package Tests;

import org.testng.annotations.AfterMethod;
import driver.DriverSingLeton;

public class BaseTest {
    @AfterMethod
    public void tearDown() {
	DriverSingLeton.closeDriver();
    }
}

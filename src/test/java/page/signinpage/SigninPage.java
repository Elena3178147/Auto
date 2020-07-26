package page.signinpage;

import page.BasePage;
import static page.signinpage.SigninPageLocators.USERNAME_INPUT;
import static page.signinpage.SigninPageLocators.PASSWORD_INPUT;
import static page.signinpage.SigninPageLocators.SING_IN_BUTTON;

public class SigninPage extends BasePage{
	String pageURL = "https://idemo.bspb.ru/";
	
	
	public void insertLogin(String login) {
		lookForElement(USERNAME_INPUT).sendKeys(login);
	}

	public void insertPassword(String password) {
		lookForElement(PASSWORD_INPUT).sendKeys(password);
	}

	public void clickLoginButton() {
		lookForElement(SING_IN_BUTTON).click();	
	}

	public void open() {
			super.open(pageURL);	
	}

}

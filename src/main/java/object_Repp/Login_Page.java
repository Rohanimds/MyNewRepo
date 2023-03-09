package object_Repp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement UserTextField;

	@FindBy(name = "user_password")
	private WebElement PassWordTextField;

	@FindBy(id = "submitButton")
	private WebElement LoginButton;

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void loginToApp(String UserName, String PassWord) {
		UserTextField.sendKeys(UserName);
		PassWordTextField.sendKeys(PassWord);
		LoginButton.click();
	}
}

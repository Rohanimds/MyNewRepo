package object_Repp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreatePage {

	public OrganizationCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement OrganizationCreateImage;

	@FindBy(name = "accountname")
	private WebElement OrganizationNameTextField;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveButton;

	public WebElement getOrganizationCreateImage() {
		return OrganizationCreateImage;
	}

	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void clickOrganizationCreateImage() {
		OrganizationCreateImage.click();
	}

	public void organizationNameTextField(String orgData) {
		OrganizationNameTextField.sendKeys(orgData);

	}

	public void saveButton() {
		SaveButton.click();
	}
}

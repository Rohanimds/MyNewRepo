package object_Repp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	public Product_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement PoductCreateImage;

	@FindBy(name = "productname")
	private WebElement ProductTextField;

	@FindBy(name = "button")
	private WebElement SaveButton;

	public WebElement getPoductCreateImage() {
		return PoductCreateImage;
	}

	public WebElement getProductTextField() {
		return ProductTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void clickOnProductCreateImage() {
		PoductCreateImage.click();
	}

	public void productTextField(String productData) {
		ProductTextField.sendKeys(productData);
	}

	public void saveButton() {
		SaveButton.click();
	}

}

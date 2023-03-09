package object_Repp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign_Page {

	public Campaign_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Campaign...']")
	private WebElement CreateCampaignImage;

	@FindBy(name = "campaignname")
	private WebElement CampaignTextField;

	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement AddCampaignProduct;

	@FindBy(name = "search_text")
	private WebElement SearchTextInWindow;

	@FindBy(name = "search")
	private WebElement SearchIconInWindow;

	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement ClickOnSave;

	public WebElement getClickOnSave() {
		return ClickOnSave;
	}

	public WebElement getSearchTextInWindow() {
		return SearchTextInWindow;
	}

	public WebElement getSearchIconInWindow() {
		return SearchIconInWindow;
	}

	public WebElement getCreateCampaignImage() {
		return CreateCampaignImage;
	}

	public WebElement getCampaignTextField() {
		return CampaignTextField;
	}

	public WebElement getAddCampaignProduct() {
		return AddCampaignProduct;
	}

	public void clickOnCreateCampaignImage() {
		CreateCampaignImage.click();
	}

	public void campaignTextField(String campaigndata) {
		CampaignTextField.sendKeys(campaigndata);
	}

	public void addCampaignProduct() {
		AddCampaignProduct.click();
	}

	public void searchTextFieldInWindow(String productData) {
		SearchTextInWindow.sendKeys(productData);
	}

	public void clickOnSearchIconInWindow() {
		SearchIconInWindow.click();
	}

	public void saveButton() {
		ClickOnSave.click();
	}
}

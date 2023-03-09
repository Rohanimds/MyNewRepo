package object_Repp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.WebDriver_File;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "(//a[text()='Organizations'])[1]")
	private WebElement Organizationxpath;

    @FindBy(linkText="Products")
    private WebElement ProductsLinkText;
    
    @FindBy(name="Campaigns")
    private WebElement CampaignsName;
    
    @FindBy(linkText="More")
    private WebElement MoreLinkText;
    
    @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
    private WebElement SignOutImg;
    
    @FindBy(xpath="//a[text()='Sign Out']")
    private WebElement SignOutLinkText;

	public WebElement getSignOutLinkText() {
		return SignOutLinkText;
	}

	public WebElement getOrganizationxpath() {
		return Organizationxpath;
	}

	public WebElement getProductsLinkText() {
		return ProductsLinkText;
	}

	public WebElement getCampaignsName() {
		return CampaignsName;
	}

	public WebElement getMoreLinkText() {
		return MoreLinkText;
	}

	public WebElement getSignOutImg() {
		return SignOutImg;
	}
    
	public void clickOnProduct() {
		ProductsLinkText.click();
	}
	
	public void clickOnCampaigns() {
		CampaignsName.click();
	}
    
	public void clickOnOrganization() {
		Organizationxpath.click();
	}
	
	public void clickOnMore(WebDriver driver) {
		WebDriver_File wlib = new WebDriver_File();
		wlib.mouseOverOnElement(driver, MoreLinkText);
	}
	
	public void signOutLink(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(SignOutImg).perform();
		SignOutLinkText.click();
	}
} 


   
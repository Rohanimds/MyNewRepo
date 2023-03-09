package campaign;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_File;
import generic_Utility.JavaRandom;
import generic_Utility.Property_File;
import generic_Utility.WebDriver_File;
import object_Repp.Campaign_Page;
import object_Repp.Home_Page;
import object_Repp.Product_Page;

public class CampaignProduct extends BaseClass {
	@Test
	public void CampaignProduct() throws Throwable {
//		String key = "webdriver.chrome.driver";
//		String value = "./target/chromedriver.exe";
//		System.getProperty(key, value);
//
//		WebDriver driver = new ChromeDriver();

		Campaign_Page campaign = new Campaign_Page(driver);
		Product_Page product = new Product_Page(driver);
		Home_Page home = new Home_Page(driver);
		Property_File plib = new Property_File();
		Excel_File elib = new Excel_File();
		JavaRandom jlib = new JavaRandom();
		WebDriver_File wlib = new WebDriver_File();

		wlib.waitForPageToLoad(driver);
		wlib.maximizeScreen(driver);

//		String URL = plib.getPropertyKeyValue("url");
//		String PASSWORD = plib.getPropertyKeyValue("password");
//		String USERNAME = plib.getPropertyKeyValue("username");

//		driver.get(URL);
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();


		home.clickOnProduct();
		product.clickOnProductCreateImage();
//		driver.findElement(By.linkText("Products")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();


		int RanNum = jlib.getRandomNum();


		String productData = elib.getExcelData("Product", 0, 0) + RanNum;

		product.productTextField(productData);
		product.saveButton();
//		driver.findElement(By.name("productname")).sendKeys(productData);
//		driver.findElement(By.name("button")).click();

		home.clickOnMore(driver);
		home.clickOnCampaigns();

		campaign.clickOnCreateCampaignImage();

//		WebElement ele = driver.findElement(By.linkText("More"));
//		Actions a = new Actions(driver);
//		a.moveToElement(ele).perform();
//		driver.findElement(By.name("Campaigns")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

		String campaigndata = elib.getExcelData("Campaign", 0, 0) + RanNum;


		campaign.campaignTextField(campaigndata);
		campaign.addCampaignProduct();
//		driver.findElement(By.name("campaignname")).sendKeys(campaigndata);
//		driver.findElement(By.xpath("//img[@alt='Select']")).click();

		wlib.switchToWindow(driver, "Products&action");

		campaign.searchTextFieldInWindow(productData);
		campaign.clickOnSearchIconInWindow();


//		driver.findElement(By.name("search_text")).sendKeys(productData);
//		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='" + productData + "']")).click();
		Thread.sleep(2000);

		wlib.switchToWindow(driver, "Campaigns&action");
		System.out.println(driver.getTitle());

		campaign.saveButton();
//		driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
}

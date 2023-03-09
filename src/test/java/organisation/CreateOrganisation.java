package organisation;

import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_File;
import generic_Utility.JavaRandom;
import generic_Utility.WebDriver_File;
import object_Repp.Home_Page;
import object_Repp.OrganizationCreatePage;

public class CreateOrganisation extends BaseClass {

	@Test
	public void CreateOrganisation() throws Throwable {

		Home_Page home = new Home_Page(driver);
		WebDriver_File wlib = new WebDriver_File();
		OrganizationCreatePage org = new OrganizationCreatePage(driver);
		JavaRandom jlib = new JavaRandom();
		Excel_File elib = new Excel_File();
		wlib.waitForPageToLoad(driver);

		driver.manage().window().maximize();

		home.clickOnOrganization();

		org.clickOrganizationCreateImage();

		int ranNum = jlib.getRandomNum();

		String orgData = elib.getExcelData("Organisation", 0, 0) + ranNum;

		org.organizationNameTextField(orgData);
		org.saveButton();

		Thread.sleep(2000);

	}
}

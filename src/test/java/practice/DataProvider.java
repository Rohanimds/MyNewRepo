package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "dataProvider_Test")
	public void companyDetails(String name, String phnum, String email) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./target/chromedriver.exe";
		System.getProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("accountname")).sendKeys(name);
		driver.findElement(By.id("phone")).sendKeys(phnum);
		driver.findElement(By.id("email1")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		driver.quit();
		Thread.sleep(2000);

	}

	@org.testng.annotations.DataProvider
	public Object[][] dataProvider_Test() {
		Object[][] objArr = new Object[3][3];

		objArr[0][0] = "AAA";
		objArr[0][1] = "7897897897";
		objArr[0][2] = "AAA@gmail.com";

		objArr[1][0] = "BBB";
		objArr[1][1] = "9879879879";
		objArr[1][2] = "BBB@gmail.com";

		objArr[2][0] = "CCC";
		objArr[2][1] = "2582582582";
		objArr[2][2] = "CCC@gmail.com";

		return objArr;
	}
}

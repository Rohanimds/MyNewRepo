package product;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {
	public static void main(String[] args) throws Throwable {
		String key = "webdriver.chrome.driver";
		String value = "./target/chromedriver.exe";
		System.getProperty(key, value);

		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./src/test/resources/Vtiger.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);

		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Products")).click();

		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();

		FileInputStream fis1 = new FileInputStream("./src/test/resources/Book1Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("Product");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();

		driver.findElement(By.name("productname")).sendKeys(data);
		driver.findElement(By.name("button")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("Delete")).click();

		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();

	}
}

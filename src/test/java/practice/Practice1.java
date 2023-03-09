package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=electronics-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Luggage");


		List<WebElement> ele1 = s.getOptions();
		System.out.println(ele1.size());

		for (WebElement a : ele1) {
			System.out.println(a.getText());
		}
	}
}
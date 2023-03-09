package generic_Utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_File {

	public void maximizeScreen(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
	}

	public void waitForElementWithCustomTimeOut(WebDriver driver, WebDriver element, int poolingTime) {
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable((By) element));

	}

	public void switchToWindow(WebDriver driver, String PartialWindowTitle) {
		Set<String> allId = driver.getWindowHandles();
		Iterator<String> it = allId.iterator();
		while (it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			if (driver.getTitle().contains(PartialWindowTitle)) {
				break;
			}
		}
	}

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String id_name_Attribute) {
		driver.switchTo().frame(id_name_Attribute);
	}

	public void select(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void mouseOverOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
		;
	}

	public void moveByOffest(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).click().perform();
	}

	public void launchBrowser(WebDriver driver,String url) {
        driver.get(url);
	}
}
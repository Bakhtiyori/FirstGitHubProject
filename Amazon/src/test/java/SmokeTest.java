import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test
	public void MavenSmoke() throws InterruptedException{
	
	
	

	System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	Thread.sleep(3000);

	driver.manage().window().maximize();

	Thread.sleep(3000);

	driver.findElement(By.id("autosuggest")).sendKeys("Ge");

	Thread.sleep(3000);

	List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

	for (WebElement list : countries) {

		if (list.getText().equalsIgnoreCase("Germany")) {

			Thread.sleep(3000);

			list.click();

			Thread.sleep(3000);

			break;
		}

	}

	driver.findElement(By.id("divpaxinfo")).click();

	Thread.sleep(3000);

	WebElement firstButton = driver.findElement(By.id("hrefIncAdt"));

	Thread.sleep(3000);

	int i;

	for (i = 0; i < 3; i++) {

		firstButton.click();

		Thread.sleep(3000);

	}

	Thread.sleep(3000);

	WebElement secondButton = driver.findElement(By.id("hrefIncChd"));

	int x;

	for (x = 0; x < 2; x++) {

		secondButton.click();

		Thread.sleep(3000);
	}

	WebElement thirdButton = driver.findElement(By.id("hrefIncInf"));

	int y;

	for (y = 0; y < 1; y++) {

		thirdButton.click();

		Thread.sleep(3000);

	}

	driver.findElement(By.id("btnclosepaxoption")).click();

	Thread.sleep(3000);

	WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

	Select test = new Select(dropDown);

	Thread.sleep(4000);

	test.selectByVisibleText("USD");

	Thread.sleep(3000);

	driver.close();

}

}

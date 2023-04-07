import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest {

	@Test
	public void SalesForceUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");

		WebDriver salesforce = new ChromeDriver();

		salesforce.get("https://login.salesforce.com/");

		salesforce.quit();

		Thread.sleep(4000);

		salesforce.quit();

		Thread.sleep(4000);

	}

	@Test(dependsOnMethods = { "SalesForceUrl" })
	public void SalesForceLogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");

		WebDriver salesforce = new ChromeDriver();

		salesforce.get("https://login.salesforce.com/");

		salesforce.findElement(By.id("username")).sendKeys("Password");

		Thread.sleep(2000);

		salesforce.findElement(By.id("password")).sendKeys("12345");

		Thread.sleep(2000);

		salesforce.findElement(By.id("Login")).click();

		Thread.sleep(4000);

		salesforce.quit();

		Thread.sleep(4000);

		salesforce.quit();

		Thread.sleep(4000);

	}

	@Test(dependsOnMethods = { "SalesForceLogin" })
	public void SalesForceLLoginNegativeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");

		WebDriver salesforce = new ChromeDriver();

		salesforce.get("https://login.salesforce.com/");

		salesforce.findElement(By.id("username")).sendKeys("  ");

		Thread.sleep(2000);

		salesforce.findElement(By.id("password")).sendKeys("  ");

		Thread.sleep(2000);

		salesforce.findElement(By.id("Login")).click();

		Thread.sleep(4000);

		salesforce.quit();

		Thread.sleep(4000);

		salesforce.quit();

		Thread.sleep(4000);

	}

}

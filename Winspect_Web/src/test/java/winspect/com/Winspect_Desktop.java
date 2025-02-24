package winspect.com;

import java.awt.Robot;
import java.net.PasswordAuthentication;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class Winspect_Desktop extends BaseClass {

	Actions ac;
	Robot robot;
	JavascriptExecutor js;

	public static WebDriver driver;

	@BeforeSuite
	private void Test_A() {
		driver = getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getUrl("https://desktop-preprod.winspectdev.com/login");

	}

	@Test(priority = 1)
	private void company_Key() {
		WebElement cK1 = driver.findElement(By.xpath("//input[@name='companyKey1']"));
		cK1.sendKeys("9");
		WebElement cK2 = driver.findElement(By.xpath("//input[@name='companyKey2']"));
		cK2.sendKeys("9");

		WebElement cK3 = driver.findElement(By.xpath("//input[@name='companyKey3']"));
		cK3.sendKeys("9");

	}

	@Test(priority = 2)
	private void userName() {
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
		userName.sendKeys("bkathirvel");

	}

	@Test(priority = 3)
	private void password() {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys("Balaji@123");

	}

	@Test(priority = 4)
	private void signIn() {
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();

	}

	@Test(priority = 5)
	private void orderCard() {
		WebElement orderCard = driver.findElement(By.xpath("//div[text()='2181']"));
		orderCard.click();

	}
	
	@Test(priority = 7)
	private void agreementPopup() {
		WebElement close = driver.findElement(By.xpath("(//button[text()='Close'])[1]"));
		close.click();
	}

	@Test(priority = 8)
	private void continueInsoection() {
		WebElement continueBtn = driver.findElement(By.xpath("(//button[text()='Continue Inspection'])[1]"));
		continueBtn.click();
	}

}

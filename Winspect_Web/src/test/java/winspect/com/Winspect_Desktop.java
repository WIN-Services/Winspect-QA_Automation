package winspect.com;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		userName.sendKeys("sempally");

	}

	@Test(priority = 3)
	private void password() {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys("Win@1234");

	}

	@Test(priority = 4)
	private void signIn() {
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();

	}

	@Test(priority = 5)
	private void orderCard() {
		//WebElement Searchbar = driver.findElement(By.className("py-2  px-10  text-[14px] font-normal leading-[24px] w-[318px] text-primary"));
		//WebElement searchBar = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
		//searchBar.sendKeys("2181");

		WebElement orderCard = driver.findElement(By.xpath("//div[text()='2235']"));
		orderCard.click();

	}
	
	@Test(priority = 7)
	private void agreementPopup() throws InterruptedException {
		WebElement close = driver.findElement(By.xpath("(//button[text()='Close'])[1]"));
		close.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	private void continueInspection() throws InterruptedException {
		WebElement continueBtn = driver.findElement(By.xpath("(//button[text()='Continue Inspection'])[1]"));
		continueBtn.click();
		Thread.sleep(2000);
	}

	@Test(priority= 9)
	private void searchRemarks() throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   WebElement exteriorWindows =driver.findElement(By.xpath("(//span[contains(@class,'text-[12px] truncateopacity-100')][normalize-space()='Exterior Windows'])[1]"));
	  // WebElement exteriorWindows =driver.findElement(By.id("cc32e2d161878fc673151f9cd491b0d7a80f"));
	   exteriorWindows.click();
	   Thread.sleep(3000);
	   

	   
	   WebElement exteriordropdown =driver.findElement(By.xpath("(//button[contains(@role,'combobox')])[1]"));
	   exteriordropdown.click();

	   WebElement dropdownvalue =driver.findElement(By.xpath("//div[@data-value='4564f350-ace3-490b-b6c3-12cdd3b97f04']"));
	   dropdownvalue.click();

	   WebElement clickOutsidePopup =driver.findElement(By.xpath("(//div[contains(text(),'Full Home Inspection')])[1]"));
	   clickOutsidePopup.click();

	  // WebElement clickonAddRemark = driver.findElement(By.xpath("//div[@class='cursor-pointer bg-"));
	  // clickonAddRemark.click();

	  //WebElement searchRemarksBtn = driver.findElement(By.xpath("//button[normalize-space()='Search remark']"));
		// WebElement searchRemarksBtn = driver.findElement(By.cssSelector("button[class='whitespace-nowrap ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 hover:bg-accent hover:text-accent-foreground h-10 w-full py-[10px] px-3 flex items-center justify-center bg-[#e6eff380] border border-[#0059811a] rounded-[5px] text-primary text-[12px] font-normal gap-2']"));
		// searchRemarksBtn.click();

		// Thread.sleep(2000);
		// WebElement selectAnySuggestion = driver.findElement(By.xpath("(//span[normalize-space()='Window Well Maintenance'])[1]"));
		// selectAnySuggestion.click();

		// WebElement addbtnRemark = driver.findElement(By.xpath("(//div[contains(text(),'Add')])[3]"));
		// addbtnRemark.click();

		//Thread.sleep(2000);
		//WebElement statusdropdown = driver.findElement(By.xpath("(//button[contains(@aria-controls,'radix-:rab:')])[1]"));
		//WebElement statusdropdown = driver.findElement(By.xpath("(//button[contains(@role,'combobox')])[3]"));
		//statusdropdown.click();


		// WebElement scroll = driver.findElement(By.xpath("(//div[@class='rounded-lg relative border-gray-300'])[1]"));
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView(true);", scroll);




		//WebElement upload_images = driver.findElement(By.xpath("(//div[contains(@class,'w-full border border-dashed border-[#C0D7E0] bg-[#f3f4f699] rounded-[8px] py-2 px-4')])[1]"));
		//upload_images.click();

		WebElement AddtoSummary = driver.findElement(By.id("add-to-summary"));
		AddtoSummary.click();

         

		WebElement completebtn = driver.findElement(By.xpath("(//button[normalize-space()='Complete'])[1]"));

	//	WebElement completebtn = driver.findElement(By.xpath("//button[normalize-space()='Complete']"));
	//	completebtn.click();

		
	//	clickToIncomplete.click();

	if(completebtn.isDisplayed())
	{
		completebtn.click();
	}
	else
	{
		WebElement clickToIncomplete = driver.findElement(By.xpath("(//button[normalize-space()='Completed (Click to Incomplete)'])[1]"));
		clickToIncomplete.click();
	}


		

		WebElement DeckseyeIcon = driver.findElement(By.xpath("(//img[contains(@alt,'eye on')])[2]"));
		DeckseyeIcon.click();


		WebElement RoofeyeIcon = driver.findElement(By.xpath("(//img[contains(@alt,'eye on')])[2]"));
		RoofeyeIcon.click();

		System.out.println("Roof icon clicked");
		
		System.out.println("Roof icon clicked");

		














		














	   

	


	   
	
	}

}

package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public static String CKEY1 = "//input[@name='companyKey1']";
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendCKey1(String value) {
		driver.findElement(By.xpath(CKEY1))
			.sendKeys(value);
	}
    
}

package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass2 {

    public WebDriver getDriver(String browserName) {
        WebDriver driver = null;

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Update with your chromedriver path
                driver = new ChromeDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
        return driver;
    }

    public void getUrl(WebDriver driver, String url) {
        driver.get(url);
    }
}

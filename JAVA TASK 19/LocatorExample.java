package org.Selenium;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample {

	public static void main(String[] args) {
		// Set the path to Firefoxdriver
	    System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

	        // Initialize FirefoxDriver
	        WebDriver driver = new FirefoxDriver();
	     
	        // Maximize to browser window
	        driver.manage().window().maximize();
	        
	        // Open the webpage
	        driver.get("https://www.guvi.in/register");
	        
	        // 1. ID Locator
	        WebElement elementByID = driver.findElement(By.id("email"));
	        

	        // 2. ClassName Locator
	        WebElement elementByClassName = driver.findElement(By.className("form-control"));

	        // 3. TagName Locator
	        WebElement elementByTagName = driver.findElement(By.tagName("input"));

	        // 4. CSS Selector Locator
	        WebElement elementByCSSSelector = driver.findElement(By.cssSelector("input[type='email']"));

	        // 5. XPath Locator
	        WebElement elementByXPath = driver.findElement(By.xpath("//*[@id='email']"));
	        
	        // Close the browser
	        driver.close();
	    };

	}



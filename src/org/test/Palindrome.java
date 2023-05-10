package org.test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Palindrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amarnath R\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		
		Actions acc = new Actions(driver);
		
		acc.keyDown(txtUser, Keys.SHIFT).sendKeys("Fraud").keyUp(txtUser, Keys.SHIFT).perform();
		
	}
}
			
			
			
		
	
	
		


package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDD {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/selenium-tutorial.html");
	driver.manage().window().maximize();
	WebElement bankSrc = driver.findElement(By.id("create2"));
	WebElement bankDest = driver.findElement(By.id("bank"));
	Actions a =new Actions(driver);
	a.dragAndDrop(bankSrc, bankDest).perform();

	}

}

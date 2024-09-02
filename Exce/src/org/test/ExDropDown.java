package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExDropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement createBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	createBtn.click();
	Thread.sleep(3000);
	WebElement ddnMonth = driver.findElement(By.id("month"));
	Select s = new Select(ddnMonth );
	s.selectByVisibleText("nov");
	s.selectByValue("6");
	s.selectByIndex(4);
	

	}

}

package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Exce\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("greens123");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}

}

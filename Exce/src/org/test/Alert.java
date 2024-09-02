package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alertBtn1 = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		alertBtn1.click();
		WebElement alertBtn2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertBtn2.click();
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.accept();
	  
	
		

	}

}

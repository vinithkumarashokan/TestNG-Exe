package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Exwindowshandling {
	static WebDriver driver;
	public static void windowsHandle() throws InterruptedException  {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closeLogin.click();
	WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	search.sendKeys("iphone",Keys.ENTER);
	Thread.sleep(3000);
	WebElement product = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	product.click();
	
	String par = driver.getWindowHandle();
	System.out.println(par);
	
	Set<String> all = driver.getWindowHandles();
	List <String> l = new LinkedList <String>();
	l.addAll(all);
	driver.switchTo().window(l.get(1));
	
	WebElement addCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	
	addCart.click();



	}

}

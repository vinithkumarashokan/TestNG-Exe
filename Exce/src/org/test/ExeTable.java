package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExeTable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	WebElement table = driver.findElement(By.id("customers"));
	List<WebElement> tRow = table.findElements(By.tagName("tr"));
	for(int i =0;i<tRow.size();i++) {
		WebElement row = tRow.get(i);
		List<WebElement> tData = table.findElements(By.tagName("td"));
		for(int j=0;j<tData.size();i++) {
			WebElement data = tData.get(j);
			String text = data.getText();
		System.out.println(text);
		
	
		}
	}
	

	}

}

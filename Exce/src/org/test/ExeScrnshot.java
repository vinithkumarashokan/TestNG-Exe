package org.test;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExeScrnshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File getScreenshotAs = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(getScreenshotAs);
	File file = new File("byghh");
	FileUtils.copyFile(getScreenshotAs, file);
	
	
	
	

	}

}

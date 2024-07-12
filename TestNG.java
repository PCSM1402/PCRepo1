package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	
	public void a() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pchoudhu\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://auth.geeksforgeeks.org/");

        // Maximize window size of browser
        driver.manage().window().maximize();

        // Enter your login email id
        driver.findElement(By.id("luser"))
            .sendKeys("sagar1.mohanty1993@gmail.com");

        // Enter your login password
        driver.findElement(By.id("password"))
            .sendKeys("Sagar@1402@");

        driver.findElement(By.className("signin-button"))
            .click();
	}

}

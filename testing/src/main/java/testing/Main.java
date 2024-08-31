package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
	
	protected static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		
		WebElement passWord = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		
		passWord.sendKeys("secret_sauce");
		
		loginButton.click();
		
		

	}
	
	
	

}

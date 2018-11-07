package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPO {
	
	private static WebElement element = null;
	
	public static WebElement form_email(WebDriver driver) {		
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement form_senha(WebDriver driver) {		
		element = driver.findElement(By.id("senha"));
		return element;
	}
}

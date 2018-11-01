package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	private static WebElement element = null;
	
	public static WebElement SetEmail(WebDriver driver) {		
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement SetSenha(WebDriver driver) {		
		element = driver.findElement(By.id("senha"));
		return element;
	}
}

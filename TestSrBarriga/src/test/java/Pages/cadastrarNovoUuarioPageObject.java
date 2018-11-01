package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cadastrarNovoUuarioPageObject {

	private static WebElement element = null;

	
	public static WebElement SetNome(WebDriver driver) {
		element = driver.findElement(By.id("nome"));
		return element;
	}

	public static WebElement SetSenha(WebDriver driver) {
		element = driver.findElement(By.id("senha"));
		return element;
	}

	public static WebElement SetEmail(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	}

	public static WebElement btn_adicionar(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		return element;
	}

	public static WebElement alert_mensagem(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-')]"));
		return element;
	}

}

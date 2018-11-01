package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adicionarContasPageObject {
	
	private static WebElement element = null;

	public static WebElement SetEmail(WebDriver driver) {		
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement SetSenha(WebDriver driver) {		
		element = driver.findElement(By.name("senha"));
		return element;
	}
	
	public static WebElement btn_entrar(WebDriver driver) {		
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		return element;
	}
	
	public static WebElement dropDown_contas(WebDriver driver) {		
		element = driver.findElement(By.linkText("Contas"));
		return element;
	}
	
	public static WebElement dropDown_adicionar(WebDriver driver) {		
		element = driver.findElement(By.linkText("Adicionar"));
		return element;
	}
	
	public static WebElement SetNome(WebDriver driver) {		
		element = driver.findElement(By.id("nome"));
		return element;
	}
	
	public static WebElement btn_salvar(WebDriver driver) {		
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		return element;
	}

}

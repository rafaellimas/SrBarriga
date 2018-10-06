package br.com.caelum.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsuariosSystemTeste {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
		
		@Test
		public void deveAdicionarUsuario() {
		
		driver.get("https://demoqa.com/registration/");

		WebElement nome = driver.findElement(By.name("first_name"));
			nome.sendKeys("Rafael");
		WebElement email = driver.findElement(By.name("last_name"));
			email.sendKeys("Lima da Silva");

		nome.submit();

	}

}

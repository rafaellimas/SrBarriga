package br.com.caelum.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NovoUsuarioPage {
	
	private WebDriver driver;

	public void cadastra(String id_campo, String valor) {
		driver.findElement(By.id(id_campo)).sendKeys(valor);
	}
	
}
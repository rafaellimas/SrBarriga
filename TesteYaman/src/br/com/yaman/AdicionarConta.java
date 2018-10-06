package br.com.yaman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarConta  {

	private WebDriver driver;
	
	public AdicionarConta(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicarLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	public void sendNome(String nome) {
		driver.findElement(By.id("nome")).sendKeys(nome);
	}
	
	public void salvar() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String obterTextos() {
		return driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	}
}

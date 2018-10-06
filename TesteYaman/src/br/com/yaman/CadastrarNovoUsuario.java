package br.com.yaman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastrarNovoUsuario {

	private WebDriver driver;

	public CadastrarNovoUsuario(WebDriver driver) {
		this.driver = driver;
	}

	public void sendNome(String nome) {
		driver.findElement(By.id("nome")).sendKeys(nome);

	}

	public void sendEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);

	}

	public void sendSenha(String senha) {
		driver.findElement(By.id("senha")).sendKeys(senha);

	}

	public void salvar() {
		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();
	}
}

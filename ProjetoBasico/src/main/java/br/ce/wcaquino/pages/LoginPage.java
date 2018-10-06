package br.ce.wcaquino.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.ce.wcaquino.core.BasePage;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	
	public void acessarTelaInicial(){
		driver.get("http://srbarriga.herokuapp.com");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotao(By.xpath("//button[.='Entrar']"));
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}

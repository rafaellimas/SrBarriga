package TestSrBarriga.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.cadastrarNovoUuarioPageObject;
import Pages.loginPageObject;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Login {

	public Login(WebDriver driver) {
		this.driver = driver;
	}

private WebDriver driver;
	
	@Dado("^que estou na tela de login$")
	public void queEstouNaTelaDeLogin() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://srbarriga.herokuapp.com/login");	
	}

	@Quando("^preencho o formulario com login \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void preenchoOFormularioComLoginESenha(String arg1, String arg2) throws Throwable {		
		loginPageObject.SetEmail(driver).sendKeys(arg1);
		loginPageObject.SetSenha(driver).sendKeys(arg2);
	}	
	
//	@Então("^recebo a mensagem de \"([^\"]*)\"$")
//	public void receboAMensagemDe(String arg1) throws Throwable {
//		String mensagem = cadastrarNovoUuarioPageObject.alert_mensagem(driver).getText();
//		Assert.assertEquals(arg1, mensagem);
//	}	

}

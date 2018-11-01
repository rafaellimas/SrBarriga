package TestSrBarriga.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.cadastrarNovoUuarioPageObject;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarNovoUsuario {

	private WebDriver driver;

	@Dado("^que estou na tela de cadastro$")
	public void queEstouNaTelaDeCadastro() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com/cadastro");

	}

	@Quando("^preencho o formulario com \"([^\"]*)\" , \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preenchoOFormularioCom(String email, String senha, String nome) throws Throwable {
		cadastrarNovoUuarioPageObject.SetNome(driver).sendKeys(nome);
		cadastrarNovoUuarioPageObject.SetEmail(driver).sendKeys(email);
		cadastrarNovoUuarioPageObject.SetSenha(driver).sendKeys(senha);
	}

	@Quando("^confirmo o formulario$")
	public void confirmoOFormulario() throws Throwable {
		cadastrarNovoUuarioPageObject.btn_adicionar(driver).click();
	}

	@Então("^recebo a mensagem de \"([^\"]*)\"$")
	public void receboAMensagemDe(String arg1) throws Throwable {
		String mensagem = cadastrarNovoUuarioPageObject.alert_mensagem(driver).getText();
		Assert.assertEquals(arg1, mensagem);
	}

}

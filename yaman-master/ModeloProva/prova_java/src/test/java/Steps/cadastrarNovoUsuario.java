package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.cadastrarNovoUsuarioPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cadastrarNovoUsuario {
	private WebDriver driver;

	@Given("^que estou na tela de cadastro$")
	public void queEstouNaTelaDeCadastro() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com/cadastro");
	}

	@When("^preencho o formulario com \"([^\"]*)\" , \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preenchoOFormularioComE(String email, String senha, String nome) throws Throwable {
		cadastrarNovoUsuarioPO.form_nome(driver).sendKeys(nome);
		cadastrarNovoUsuarioPO.form_email(driver).sendKeys(email);
		cadastrarNovoUsuarioPO.form_senha(driver).sendKeys(senha);
	}

	@When("^confirmo o formulario$")
	public void confirmoOFormulario() throws Throwable {
		cadastrarNovoUsuarioPO.btn_adicionar(driver).click();
	}

	@Then("^recebo a mensagem de \"([^\"]*)\"$")
	public void receboAMensagemDe(String arg1) throws Throwable {
		String mensagem = cadastrarNovoUsuarioPO.alert_mensagem(driver).getText();
		Assert.assertEquals(arg1, mensagem);
	}		

}

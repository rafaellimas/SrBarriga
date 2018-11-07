package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.adicionarContasPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class adicionarContas {
	private WebDriver driver;

	@Given("^que estou logado com um usuario valido$")
	public void queEstouLogadoComUmUsuarioValido() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		
		adicionarContasPO.form_email(driver).sendKeys("flavior@flavior");
		adicionarContasPO.form_senha(driver).sendKeys("f");
		adicionarContasPO.btn_entrar(driver).click();
	}

	@When("^navego ate a janela de adicionar contas$")
	public void navegoAteAJanelaDeAdicionarContas() throws Throwable {
		adicionarContasPO.dropDown_contas(driver).click();
		adicionarContasPO.dropDown_adicionar(driver).click();
	}

	@When("^adiciono uma conta com o valor \"([^\"]*)\"$")
	public void adicionoUmaContaComOValor(String arg1) throws Throwable {
		adicionarContasPO.form_nome(driver).sendKeys(arg1);
		adicionarContasPO.btn_salvar(driver).click();
	}

//	@After(order = 0)
//	public void fecharBrowser() {
//		driver.quit();
//	}

}

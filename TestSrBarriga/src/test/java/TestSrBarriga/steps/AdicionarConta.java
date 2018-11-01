package TestSrBarriga.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.adicionarContasPageObject;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class AdicionarConta {

	public class adicionarContas {
		private WebDriver driver;

		@Dado("^que estou logado com um usuario valido$")
		public void queEstouLogadoComUmUsuarioValido() throws Throwable {
			driver = new ChromeDriver();
			driver.get("https://srbarriga.herokuapp.com");

			adicionarContasPageObject.SetEmail(driver).sendKeys("rafael@teste");
			adicionarContasPageObject.SetSenha(driver).sendKeys("12345678");
			adicionarContasPageObject.btn_entrar(driver).click();
		}

		@Quando("^navego ate a janela de adicionar contas$")
		public void navegoAteAJanelaDeAdicionarContas() throws Throwable {
			adicionarContasPageObject.dropDown_contas(driver).click();
			adicionarContasPageObject.dropDown_adicionar(driver).click();
		}

		@Quando("^adiciono uma conta com o valor \"([^\"]*)\"$")
		public void adicionoUmaContaComOValor(String arg1) throws Throwable {
			adicionarContasPageObject.SetNome(driver).sendKeys(arg1);
			adicionarContasPageObject.btn_salvar(driver).click();
		}

	}

}

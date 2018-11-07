package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	private WebDriver driver;
	
	@Given("^que estou na tela de login$")
	public void queEstouNaTelaDeLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://srbarriga.herokuapp.com/login");	
	}

	@When("^preencho o formulario com \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preenchoOFormularioComE(String arg1, String arg2) throws Throwable {		
		loginPO.form_email(driver).sendKeys(arg1);
		loginPO.form_senha(driver).sendKeys(arg2);
	}

	@Then("^sou direcionado para a url \"([^\"]*)\"$")
	public void souDirecionadoParaAUrl(String arg1) throws Throwable {
		String path = driver.getCurrentUrl();
		Assert.assertEquals(arg1, path);
	}	

}

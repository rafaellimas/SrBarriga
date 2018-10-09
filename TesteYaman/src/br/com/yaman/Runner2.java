package br.com.yaman;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner2 {

	private WebDriver driver;
	private CadastrarNovoUsuario cadastrar; 
	private Login login;
	private AdicionarConta adicionar;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com/cadastro");
		this.adicionar = new AdicionarConta(driver);
		this.cadastrar = new CadastrarNovoUsuario(driver);
		this.login = new Login(driver);
		
	}

	@Test
	public void cadastrarNovoUsuario() {
		cadastrar.sendNome("Rafael");
		cadastrar.sendEmail("rafael@test5");
		cadastrar.sendSenha("12345678");
		cadastrar.salvar();
	}

	@Test
	public void logarAplicacao() {
		login.clicarBotao();
		login.sendEmail("rafael@teste");
		login.sendSenha("12345678");
		login.entrar();
	}

	@Test
	public void inserirConta() {
		login.clicarBotao();
		login.logar("rafael@teste2", "12345678");
		adicionar.clicarLink("Contas");
		adicionar.clicarLink("Adicionar");

		adicionar.sendNome("Santander SA.");
		adicionar.salvar();

		adicionar.obterTextos();
	}
}

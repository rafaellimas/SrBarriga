package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CadastroPages;

public class CadastroTeste {
	
	static WebDriver driver;
	static CadastroPages cadastroPages;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?intl=br&lang=pt-BR&specId=yidReg");
		cadastroPages = new CadastroPages(driver);
		
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CadastroPages.preencherCampos();
	}

}

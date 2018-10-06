package meuPrimeiroTeste;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbirNavegadorTest {

	//Instanciando a clsse webdriver
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Dizer onde está o executavel
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com.br");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Fecha apenas a aba que foi usada 
		driver.close();
		//Fecha o browser inteiro
		//driver.quit();
	}

}

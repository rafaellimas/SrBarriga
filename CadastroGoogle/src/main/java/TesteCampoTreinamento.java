import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCampoTreinamento {

	private WebDriver driver;
	private DSL dsl;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get("file://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL(driver);
	}

	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void testeTextFild() {
		dsl.escrever("elementosForm:nome", "Rafael");
		Assert.assertEquals("Rafael", dsl.obterValoCampo("elementosForm:nome"));
	}

	@Test
	public void testeTextArea() {
		dsl.escrever("elementosForm:sugestoes", "Olá Mundo");
		Assert.assertEquals("Olá Mundo", dsl.obterValoCampo("elementosForm:sugestoes"));

	}

	@Test
	public void testeButtonMasculino() {
		dsl.clicarRadioButton("elementosForm:sexo:0");
		Assert.assertTrue(dsl.radioFoiSelecionado("elementosForm:sexo:0"));
	}

	@Test
	public void testeCheckBox() {
		dsl.clicarRadioButton("elementosForm:comidaFavorita:2");
		Assert.assertTrue(dsl.radioFoiSelecionado("elementosForm:comidaFavorita:2"));
	}

	@Test
	public void testeComboBox() {
		dsl.selecionarCombo("elementosForm:escolaridade", "2o grau incompleto");
		Assert.assertEquals("2o grau incompleto", dsl.obterValoCampo("elementosForm:escolaridade"));
	}

	@Test
	public void deveVerificarValoresCombo() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);

		java.util.List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8, options.size());
	}

	@Test
	public void testeComboBoxMultiplos() {
		dsl.selecionarCombo("elementosForm:esportes", "Natacao");
		dsl.selecionarCombo("elementosForm:esportes", "Corrida");
		dsl.selecionarCombo("elementosForm:esportes", "O que eh esporte?");
		
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		java.util.List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());

		combo.deselectByVisibleText("Corrida");
		allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(2, allSelectedOptions.size());

	}

	@Test
	public void testeButton() {
		dsl.clicarBotao("buttonSimple");
		
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
	}

	@Test
	// @Ignore
	public void testeLinks() {
		dsl.clicarLink("Voltar");
		Assert.assertEquals("Voltou!", dsl.obterTexto("resultado"));
	}

	@Test
	public void testeBuscarTextosNaTela() {
		Assert.assertEquals("Campo de Treinamento", driver.findElement(By.tagName("h3")).getText());

		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",
				driver.findElement(By.className("facilAchar")).getText());
	}

}

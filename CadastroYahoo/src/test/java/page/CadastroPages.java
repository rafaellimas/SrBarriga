package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		CadastroPages.driver = driver;
	}

	public static void preencherCampos() {
		WebElement nome = driver.findElement(By.name("firstName"));
		nome.sendKeys("Rafael");

		WebElement sobreNome = driver.findElement(By.name("lastName"));
		sobreNome.sendKeys("Lima da Silva");

		WebElement email = driver.findElement(By.id("usernamereg-yid"));
		email.sendKeys("leafar_silvalima");
		
		WebElement senha = driver.findElement(By.id("usernamereg-password"));
		senha.sendKeys("_A1b2c3d4e5");

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("11975527175");

		WebElement mesNasciemnto = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		mesNasciemnto.click();

		WebElement mesNasciemnto2 = driver.findElement(By.xpath("//option[@value='7']"));
		mesNasciemnto2.click();

		WebElement diaNasciemnto = driver.findElement(By.xpath("//input[@id='usernamereg-day']"));
		diaNasciemnto.click();

		WebElement diaNasciemnto2 = driver.findElement(By.name("dd"));
		diaNasciemnto2.sendKeys("14");

		WebElement anoNaciemnto = driver.findElement(By.name("yyyy"));
		anoNaciemnto.sendKeys("1991");

//		WebElement sex = driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']"));
//		sex.click();
//
//		WebElement sex2 = driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']"));
//		sex2.click();

		WebElement button = driver.findElement(By.id("reg-submit-button"));
		button.click();
	}

}

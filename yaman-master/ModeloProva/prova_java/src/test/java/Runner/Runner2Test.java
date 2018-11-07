package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@cadastro, @login, @adicionarcontas"}, 
		glue = {"" }, 
		features = "src/test/java/Features/",
		monochrome = true
		)

public class Runner2Test {
 
}
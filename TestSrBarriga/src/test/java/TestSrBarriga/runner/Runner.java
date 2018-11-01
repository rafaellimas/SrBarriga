package TestSrBarriga.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/",
		glue = "TestSrBarriga.steps",
		tags = {"~@cadastro, @login, @adicionarcontas"}, 
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)

public class Runner {
 
}

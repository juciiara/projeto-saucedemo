package saucedemo.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import saucedemo.drivers.Drivers;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features", // Caminho dos arquivos .feature
		tags = "@login ", // Filtra os cenários a serem executados pela tag
		glue = "saucedemo.steps", // Pacote das definições de passos (Step Definitions)
		dryRun = false, // Valida se os passos têm implementação sem executar os testes
		monochrome = true, // Melhora a legibilidade do console
		plugin = { "pretty", "html:target/cucumber-report.html" }, // Formato de saída e relatório HTML
		snippets = SnippetType.CAMELCASE // Gera métodos de passos no formato camelCase

)

public class Executa extends Drivers {

	/**
	 * Inicializa o teste abrindo o navegador, maximizando a janela 
	 * e acessando a URL do sistema.
	 */
	
	public static void iniciarTest() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	}

}

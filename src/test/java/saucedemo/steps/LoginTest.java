package saucedemo.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.drivers.Drivers;
import saucedemo.elementos.Elementos;
import saucedemo.metodos.Metodos;
import saucedemo.pages.LoginPage;
import saucedemo.runner.Executa;

public class LoginTest extends Drivers {

	LoginPage login = new LoginPage();
	Metodos mt = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setup() {
		Executa.iniciarTest();

	}

	@Given("que nao esteja logado")
	public void queNaoEstejaLogado() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("preencher o campo usuário")
	public void preencherOCampoUsuário() {
		mt.escrever(el.usernome, "standard_user");

	}

	@When("preencher o campo senha")
	public void preencherOCampoSenha() {
		mt.escrever(el.password, "secret_sauce");

	}

	@When("clicar no botão de login")
	public void clicarNoBotãoDeLogin() {
		mt.clicar(el.btnLogin);

	}

	@Then("o login é realizado com sucesso")
	public void oLoginÉRealizadoComSucesso() {
		assertTrue(driver.getCurrentUrl().contains("inventory"));
	}

	@When("preencher o campo senha errada")
	public void preencherOCampoSenhaErrada() {
		mt.escrever(el.password, "senha errada");

	}

	@When("preencher o campo usuário errado")
	public void preencherOCampoUsuárioErrado() {
		mt.escrever(el.usernome, "usuario errado");

	}

	@When("preencher o campo usuário em branco")
	public void preencherOCampoUsuárioEmBranco() {
		mt.escrever(el.usernome, "");

	}

	@When("preencher o campo senha em branco")
	public void preencherOCampoSenhaEmBranco() {
		mt.escrever(el.password, "");

	}

	@When("preencher o campo usuário bloqueado")
	public void preencherOCampoUsuárioBloqueado() {
		mt.escrever(el.usernome, "locked_out_user");
	}

	@Then("o sistema exibe a mensagem de erro")
	public void oSistemaExibeAMensagemDeErro() {
	    // Aguarda até que a mensagem de erro seja visível
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement mensagemErroElement = wait.until(ExpectedConditions.visibilityOfElementLocated(el.mensagemErro));

	    // Captura a mensagem de erro
	    String mensagemReal = mensagemErroElement.getText();
	    System.out.println("Mensagem de erro: " + mensagemReal); // Para depuração

	    // Valida a mensagem de erro com base nas condições
	    if (mensagemReal.contains("Sorry, this user has been locked out")) {
	        assertEquals("Epic sadface: Sorry, this user has been locked out.", mensagemReal.trim());
	    } else if (mensagemReal.contains("Username and password do not match any user in this service")) {
	        assertEquals("Epic sadface: Username and password do not match any user in this service", mensagemReal.trim());
	    }
	}


	}




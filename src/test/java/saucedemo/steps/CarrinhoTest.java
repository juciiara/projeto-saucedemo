package saucedemo.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.drivers.Drivers;
import saucedemo.elementos.Elementos;
import saucedemo.metodos.Metodos;
import saucedemo.pages.CarrinhoPage;

public class CarrinhoTest extends Drivers {

	CarrinhoPage ca = new CarrinhoPage();
	Metodos mt = new Metodos();
	Elementos el = new Elementos();

	@Given("Que estou logado no site Saucedemo {string}")
	public void queEstouLogadoNoSiteSaucedemo(String site) {
		driver.get(site);
		mt.escrever(el.usernome, "standard_user");
		mt.escrever(el.password, "secret_sauce");
		mt.clicar(el.btnLogin);

	}

	@When("adiciono produtos ao carrinho")
	public void adicionoProdutosAoCarrinho() {
		ca.adicionarProdutosNoCarrinho();

	}

	@When("acesso o carrinho de compras")
	public void acessoOCarrinhoDeCompras() {
		ca.acessarCarrinho();

	}

	@When("Os produtos devem estar presentes no carrinho")
	public void osProdutosDevemEstarPresentesNoCarrinho() {
		boolean produtosPresentes = ca.verificarProdutosNoCarrinho();
		assertEquals(" Os produtos não estao presentes no carrinho", true, produtosPresentes);

	}

	@When("clico no botao de checkout")
	public void clicoNoBotaoDeCheckout() {
		ca.checkout();

	}

	@Then("sistema redireciona para aba Checkout: Your Information")
	public void sistemaRedirecionaParaAbaCheckoutYourInformation() {
		String urlAtual = driver.getCurrentUrl();
		assertTrue(" Erro no redirecionamento para checkout", urlAtual.contains("checkout-step-one"));

	}

	@Given("estou na página {string}")
	public void estouNaPágina(String paginaUrl) {
		driver.get(paginaUrl);

	}

	@When("preencho os campos {string}, {string} e {string}")
	public void preenchoOsCamposE(String nome, String sobrenome, String cep) {
		ca.preencherInformacoesCheckout("Juciara", "Conceição", "04177240");

	}

	@When("clico no botão \"Continue")
	public void clicoNoBotãoContinue() {
		ca.clicarBotaoContinuar();

	}

	@Then("sou redirecionado para a próxima etapa do checkout")
	public void souRedirecionadoParaAPróximaEtapaDoCheckout() {
		assertTrue(" Erro no redirecionamento!", driver.getCurrentUrl().contains("checkout-step-two"));
	}

	@Then("clico em {string} para finalizar")
	public void clicoEmParaFinalizar(String finish) {
		ca.finalizarCompra();

	}

	@Then("clico em {string} para voltar a pagina inicial de produtos")
	public void clicoEmParaVoltarAPaginaInicialDeProdutos(String Backhome) {
		ca.voltarPaginaInicialProdutos();

	}

	@Then("acesso o botao de menu da pagia inicial")
	public void acessoOBotaoDeMenuDaPagiaInicial() {
		ca.acessarMenu();

	}

	@When("clico em logout")
	public void clicoEmLogout() {
		ca.logout();

	}

	@Then("logout realizado com sucesso")
	public void logoutRealizadoComSucesso() {
		new WebDriverWait(driver,Duration.ofSeconds(0)).until(ExpectedConditions.urlContains("saucedemo.com"));
		assertTrue("Logout não realizado com sucesso!",driver.getCurrentUrl().contains("saucedemo.com"));

	}

}

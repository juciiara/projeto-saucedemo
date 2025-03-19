package saucedemo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.drivers.Drivers;
import saucedemo.pages.CarrinhoPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProdutosPage;

public class RemoverProdutosTest extends Drivers {

	LoginPage login = new LoginPage();
	ProdutosPage produtos = new ProdutosPage();
	CarrinhoPage ca = new CarrinhoPage();

	@Given("que o usuário está logado no SauceDemo")
	public void queOUsuárioEstáLogadoNoSauceDemo() {
		driver.get("https://www.saucedemo.com/");
		login.loginComSucesso("standard_user", "secret_sauce");
	}
 
	@Given("adiciona um produto ao carrinho")
	public void adicionaUmProdutoAoCarrinho() { 
		produtos.adicionarProdutosAoCarrinho(); // Adiciona produtos ao carrinho
	}

	@When("acessa o carrinho")
	public void acessaOCarrinho() {
		produtos.acessarCarrinho(); // Acessa o carrinho
	}

	@When("remove o produto")
	public void removeOProduto() {

		produtos.removerProdutosDoCarrinho(); // Remove os produtos do carrinho
		
	}

	@Then("o carrinho deve estar vazio")
	public void oCarrinhoDeveEstarVazio() {
	    // Verifique se o carrinho está vazio usando a função corrigida
	    boolean carrinhoVazio = ca.verificarProdutosNoCarrinho();
	    if (!carrinhoVazio) {
	        System.out.println("Carrinho ainda contém produtos!");
	    }
	    assert carrinhoVazio : "O carrinho não está vazio!";
	   // driver.quit();
	}

}

package saucedemo.pages;

import org.openqa.selenium.WebElement;

import saucedemo.drivers.Drivers;
import saucedemo.elementos.Elementos;
import saucedemo.metodos.Metodos;

public class CarrinhoPage extends Drivers {

	Metodos mt = new Metodos();
	Elementos el = new Elementos();

	public void adicionarProdutosNoCarrinho() {

		mt.clicar(el.Backpack);
		mt.clicar(el.BikeLight);
		mt.clicar(el.Shirt);
		mt.clicar(el.Jacket);
		mt.clicar(el.Onesie);
		mt.clicar(el.ShirtRed);

	}

	public void acessarCarrinho() {
		mt.clicar(el.clicarCarrinho);

	}

	public boolean verificarProdutosNoCarrinho() {
		WebElement produtos = driver.findElement(el.verifProdutoCar);
		return produtos.isDisplayed();
	}

	public void checkout() {
		mt.clicar(el.checkout);

	}

	public void preencherInformacoesCheckout(String nome, String sobrenome, String cep) {
		mt.escrever(el.firstNome, nome);
		mt.escrever(el.lastNome, sobrenome);
		mt.escrever(el.postalCode, cep);

	}

	public void clicarBotaoContinuar() {
		mt.clicar(el.btnContinue);
	}

	public void finalizarCompra() {
		mt.clicar(el.finish);
	}

	public void voltarPaginaInicialProdutos() {
		mt.clicar(el.backHome);
	}

	public void acessarMenu() {
		mt.clicar(el.abrirMenu);
	}

	public void logout() {
		mt.tab();
		mt.clicar(el.logout);

	}
}

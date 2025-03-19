package saucedemo.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import saucedemo.drivers.Drivers;
import saucedemo.elementos.Elementos;
import saucedemo.metodos.Metodos;

public class ProdutosPage extends Drivers {

	Metodos mt = new Metodos();
	Elementos el = new Elementos();

	// Método para adicionar produtos ao carrinho
	public void adicionarProdutosAoCarrinho() {
		mt.clicar(el.Backpack);
		mt.clicar(el.BikeLight);
		mt.clicar(el.Shirt);
		mt.clicar(el.Jacket);
		mt.clicar(el.Onesie);
		mt.clicar(el.ShirtRed);
	}

	// Método para remover produtos do carrinho
	public void removerProdutosDoCarrinho() {
		System.out.println("Removendo produtos do carrinho...");
		mt.clicar(el.removeBackpack);
		mt.clicar(el.removeBikeLight);
		mt.clicar(el.removeShirt);
		mt.clicar(el.removeJacket);
		mt.clicar(el.removeOnesie);
		mt.clicar(el.removeShirtRed);

	}

	public boolean verificarProdutosNoCarrinho() {
	    try {
	        // Verifique um elemento que só aparece quando o carrinho está vazio
	        WebElement carrinhoVazioMensagem = driver.findElement(By.cssSelector(".cart_empty_message"));
	        return carrinhoVazioMensagem.isDisplayed();  // Retorna true se a mensagem de carrinho vazio aparecer
	    } catch (NoSuchElementException e) {
	        // Caso a mensagem não seja encontrada, o carrinho não está vazio
	        return false;
	    }
	}


	// Método para acessar o carrinho
	public void acessarCarrinho() {
		mt.clicar(el.clicarCarrinho);
	}
}

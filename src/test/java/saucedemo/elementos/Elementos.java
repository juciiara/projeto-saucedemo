package saucedemo.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Login
	public By usernome = By.id("user-name");
	public By password = By.id("password");
	public By btnLogin = By.id("login-button");
	public By mensagemErro =By.cssSelector(".error-message-container");
	
	//Produtos home
	public By Backpack = By.id("add-to-cart-sauce-labs-backpack");
	public By BikeLight = By.id("add-to-cart-sauce-labs-bike-light");
	public By Shirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	public By Jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	public By  Onesie = By.id("add-to-cart-sauce-labs-onesie");
	public By ShirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	public By clicarCarrinho = By.xpath("//a[@class='shopping_cart_link']");
	public By verifProdutoCar = By.xpath("//div[@class='cart_list']");
	
	//Checkout
	public By checkout = By.id("checkout");
	
	// Checkout: Your Information
	public By firstNome = By.id("first-name");
	public By lastNome = By.id("last-name");
	public By postalCode = By.id("postal-code"); 
	public By btnContinue = By.id("continue");
	public By finish = By.id("finish");
	
	//Retornar Pagina Inicial
	public By backHome = By.id("back-to-products");
	
	//Logout do usuario
	public By abrirMenu = By.id("react-burger-menu-btn");
	public By logout = By.id("logout_sidebar_link");
	
	
	 
	

}
 
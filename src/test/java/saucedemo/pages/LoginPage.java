package saucedemo.pages;

import saucedemo.drivers.Drivers;
import saucedemo.elementos.Elementos;
import saucedemo.metodos.Metodos;

public class LoginPage extends Drivers {

	Metodos mt = new Metodos();
	Elementos el = new Elementos();

	public  void loginComSucesso(String user, String password) {
		mt.escrever(el.usernome, user);
		mt.escrever(el.password, password);
		mt.clicar(el.btnLogin);

	}

}

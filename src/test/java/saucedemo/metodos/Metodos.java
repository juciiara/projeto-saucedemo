package saucedemo.metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import saucedemo.drivers.Drivers;

public class Metodos extends Drivers {

	// Localiza o elemento e realiza um clique.

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Localiza o elemento e insere um texto.

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	// Aguarda até que o elemento esteja visível na página.

	public void esperarElementoVisivel(By elemento, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

	// Valida se o texto de um elemento corresponde ao esperado.

	public void validarTexto(By elemento, String textoEsperado) {
		WebElement el = driver.findElement(elemento);
		String textoCapturado = el.getText();
		// Validação mais explícita
		assertEquals("O texto exibido não é o esperado", textoEsperado, textoCapturado);
	}

	// Simula a tecla TAB no teclado para navegar entre os campos.

	public void tab() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
	}
}

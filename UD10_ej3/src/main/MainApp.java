package main;

import java.util.Random;

import modelo.NumeroParImpar;

public class MainApp {

	public static void main(String[] args) {

		Random random = new Random();
		// generamos un n�mero aleatorio
		int numeroAleatorio = random.nextInt(999);

		// instanciamos la clase NumeroparImpar
		NumeroParImpar parImpar = new NumeroParImpar();

		// invocamos el m�todo que comprueba si el n�mero generado aleatoriamente es par/impar
		parImpar.esPar(numeroAleatorio);

	}

}

package main;

import java.util.Random;

import modelo.NumeroParImpar;

public class MainApp {

	public static void main(String[] args) {

		Random random = new Random();
		// generamos un número aleatorio
		int numeroAleatorio = random.nextInt(999);

		// instanciamos la clase NumeroparImpar
		NumeroParImpar parImpar = new NumeroParImpar();

		// invocamos el método que comprueba si el número generado aleatoriamente es par/impar
		parImpar.esPar(numeroAleatorio);

	}

}
